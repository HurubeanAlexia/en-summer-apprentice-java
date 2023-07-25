package com.endavaspring.endavapractica.dto;

public class EventTypeDTO {
    private Integer id;
    private String eventTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public EventTypeDTO(Integer id, String eventTypeName) {
        this.id = id;
        this.eventTypeName = eventTypeName;
    }

    public EventTypeDTO() {
    }

    @Override
    public String toString() {
        return "EventTypeDTO{" +
                "id=" + id +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }
}
