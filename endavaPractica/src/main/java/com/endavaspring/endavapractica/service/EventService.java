package com.endavaspring.endavapractica.service;

import com.endavaspring.endavapractica.domain.Event;
import com.endavaspring.endavapractica.dto.EventDTO;
import com.endavaspring.endavapractica.mapper.EventMapper;
import com.endavaspring.endavapractica.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventDTO> getEventsByVenueIdAndEventType(Long venueId, String eventTypeName) {
        List<Event> events =  this.eventRepository.findEventsByVenueVenueIdAndEventTypeEventTypeName(venueId, eventTypeName);
        return EventMapper.convertModelListToOutputDTOList(events);

    }

}
