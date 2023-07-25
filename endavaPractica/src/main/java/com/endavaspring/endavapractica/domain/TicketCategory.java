package com.endavaspring.endavapractica.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;


import java.io.Serializable;

@Entity
@Table(name = "Ticket_categories")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_category_id")
    private Long ticketCategoryId;

    @Column(name = "ticket_category_description")
    private String ticketCategoryDescription;

    @Column(name = "price")
    private Float price;

    @JsonIgnoreProperties("ticketCategory")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private Event eventId;


    public Long getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Long ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getTicketCategoryDescription() {
        return ticketCategoryDescription;
    }

    public void setTicketCategoryDescription(String ticketCategoryDescription) {
        this.ticketCategoryDescription = ticketCategoryDescription;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setEvent(Event eventId) {
        this.eventId = eventId;
    }

    public Event getEventId() {
        return eventId;
    }
}
