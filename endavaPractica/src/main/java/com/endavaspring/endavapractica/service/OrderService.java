package com.endavaspring.endavapractica.service;


import com.endavaspring.endavapractica.domain.*;
//import com.endavaspring.endavapractica.repository.EventRepository;
import com.endavaspring.endavapractica.dto.OrderInputDTO;
import com.endavaspring.endavapractica.dto.OrderOutputDTO;
import com.endavaspring.endavapractica.mapper.OrderMapper;
import com.endavaspring.endavapractica.repository.CustomerRepository;
import com.endavaspring.endavapractica.repository.OrdersRepository;
import com.endavaspring.endavapractica.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrdersRepository ordersRepository;
    private final TicketCategoryRepository ticketCategoryRepository;
    private final CustomerRepository customerRepository;


    @Autowired
    public OrderService(OrdersRepository ordersRepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository) {
        this.ordersRepository = ordersRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.customerRepository = customerRepository;
    }

    public List<OrderOutputDTO> getOrdersByCustomer(Long customerId){
        List<Order> orders = this.ordersRepository.getOrdersByCustomerCustomerId(customerId);
        return OrderMapper.convertModelListToOutputDTOList(orders);
    }

    public OrderOutputDTO saveOrder(OrderInputDTO orderInputDTO, Long customerId){
        TicketCategory ticketCategory = this.ticketCategoryRepository.getTicketCategoriesByTicketCategoryId(orderInputDTO.getTicketCategoryId());
        Customer customer = this.customerRepository.getCustomerByCustomerId(customerId);
        Order saveOrder = this.ordersRepository.save(OrderMapper.convertInputDTOToModel(orderInputDTO, ticketCategory, customer));
        return OrderMapper.convertModelOrderOutputDTO(saveOrder);
    }


    }

