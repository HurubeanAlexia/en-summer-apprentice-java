package com.endavaspring.endavapractica.mapper;

import com.endavaspring.endavapractica.config.DataTimeFormat;
import com.endavaspring.endavapractica.domain.Event;
import com.endavaspring.endavapractica.dto.EventDTO;

import java.util.ArrayList;
import java.util.List;

public class EventMapper {

    public static EventDTO convertModelToDTO(Event event){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId(event.getEventId());
        eventDTO.setVenue(event.getVenue());
        eventDTO.setEventType(event.getEventType().getEventTypeName());
        eventDTO.setDescription(event.getEventDescription());
        eventDTO.setEventName(event.getEventName());
        eventDTO.setStartDate(event.getStartDate().format(DataTimeFormat.formatter));
        eventDTO.setEndDate(event.getEndDate().format(DataTimeFormat.formatter));
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
