package com.endavaspring.endavapractica.repository;

import com.endavaspring.endavapractica.domain.Event;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findEventsByVenueVenueIdAndEventTypeEventTypeName(Long venueID, String eventTypeName);


}
