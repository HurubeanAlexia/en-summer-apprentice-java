package com.endavaspring.endavapractica.dto;

import com.endavaspring.endavapractica.domain.Venue;

import java.util.List;

public class EventDTO {
        private Long eventId;
        private Venue venue;
        private String eventType;
        private String description;
        private String eventName;
        private String startDate;
        private String endDate;
        private List<TicketCategoryDTO> ticketCategories;


        public Long getEventId() {
                return eventId;
        }

        public void setEventId(Long eventId) {
                this.eventId = eventId;
        }

        public Venue getVenue() {
                return venue;
        }

        public void setVenue(Venue venue) {
                this.venue = venue;
        }

        public String getEventType() {
                return eventType;
        }

        public void setEventType(String eventType) {
                this.eventType = eventType;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getEventName() {
                return eventName;
        }

        public void setEventName(String eventName) {
                this.eventName = eventName;
        }

        public String getStartDate() {
                return startDate;
        }

        public void setStartDate(String startDate) {
                this.startDate = startDate;
        }

        public String getEndDate() {
                return endDate;
        }

        public void setEndDate(String endDate) {
                this.endDate = endDate;
        }

        public List<TicketCategoryDTO> getTicketCategories() {
                return ticketCategories;
        }

        public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
                this.ticketCategories = ticketCategories;
        }

        public EventDTO() {
        }
}
