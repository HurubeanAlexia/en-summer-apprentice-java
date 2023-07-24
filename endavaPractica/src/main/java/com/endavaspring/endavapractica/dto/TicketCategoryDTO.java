package com.endavaspring.endavapractica.dto;

import jakarta.persistence.criteria.CriteriaBuilder;

public class TicketCategoryDTO {
    private Long ticketCategoryId;
    private String description;
    private Float price;

    public Long getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Long ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public TicketCategoryDTO() {
    }
}
