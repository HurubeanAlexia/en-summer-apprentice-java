package com.endavaspring.endavapractica.controller;

import com.endavaspring.endavapractica.dto.EventDTO;
import com.endavaspring.endavapractica.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EventDTO> getEvents(@RequestParam("venueId") Long venueId,
                                    @RequestParam("eventType") String eventType) {
        return eventService.getEventsByVenueIdAndEventType(venueId, eventType);
    }
}
