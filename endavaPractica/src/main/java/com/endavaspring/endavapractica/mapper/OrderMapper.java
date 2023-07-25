package com.endavaspring.endavapractica.mapper;

import com.endavaspring.endavapractica.domain.Order;
import com.endavaspring.endavapractica.domain.TicketCategory;
import com.endavaspring.endavapractica.domain.Customer;
import com.endavaspring.endavapractica.dto.OrderInputDTO;
import com.endavaspring.endavapractica.dto.OrderOutputDTO;

import java.util.ArrayList;
import java.util.List;

public class OrderMapper {

    public static OrderOutputDTO convertModelOrderOutputDTO(Order order){
        OrderOutputDTO orderOutputDTO = new OrderOutputDTO();
        orderOutputDTO.setEventID(order.getTicketCategory().getEventId().getEventId());
        orderOutputDTO.setOrderedAt(order.getOrderedAt());
        orderOutputDTO.setTicketCategoryID(order.getTicketCategory().getTicketCategoryId());
        orderOutputDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderOutputDTO.setTotalPrice(order.getTotalPrice());
        return orderOutputDTO;
    }

    public static Order convertInputDTOToModel(OrderInputDTO orderInputDTO, TicketCategory ticketCategory, Customer customer){
        Order order = new Order();
        order.setOrderedAt(java.time.LocalDateTime.now());
        order.setNumberOfTickets(orderInputDTO.getNumberOfTickets());
        order.setTotalPrice(orderInputDTO.getNumberOfTickets() * ticketCategory.getPrice());
        order.setCustumer(customer);
        order.setTicketCategory(ticketCategory);
        return order;
    }

    public static List<OrderOutputDTO> convertModelListToOutputDTOList(List<Order> orders){
        List<OrderOutputDTO> orderOutputDTOS = new ArrayList<>();
        for(Order order: orders){
            orderOutputDTOS.add(convertModelOrderOutputDTO(order));

        }
        return orderOutputDTOS;
    }

}
