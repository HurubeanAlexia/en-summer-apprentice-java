package com.endavaspring.endavapractica.mapper;

import com.endavaspring.endavapractica.domain.Event;
import com.endavaspring.endavapractica.dto.EventDTO;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EventMapper {

    public static DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static EventDTO convertModelToDTO(Event event){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId(event.getEventId());
        eventDTO.setVenue(event.getVenue());
        eventDTO.setEventType(event.getEventType().getEventTypeName());
        eventDTO.setDescription(event.getEventDescription());
        eventDTO.setEventName(event.getEventName());
        eventDTO.setStartDate(event.getStartDate().format(formatter));
        eventDTO.setEndDate(event.getEndDate().format(formatter));
        eventDTO.setTicketCategories(TicketCategoryMapper.convertModelListToOutputDTOList(event.getTicketCategory()));
        return eventDTO;

    }


    public static List<EventDTO> convertModelListToOutputDTOList(List<Event> events){
        List<EventDTO> eventDTOS = new ArrayList<>();
        for(Event event: events){
            eventDTOS.add(convertModelToDTO(event));

        }
        return eventDTOS;
    }
}
