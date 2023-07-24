package com.endavaspring.endavapractica.controller;

import com.endavaspring.endavapractica.dto.OrderInputDTO;
import com.endavaspring.endavapractica.dto.OrderOutputDTO;
import com.endavaspring.endavapractica.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{customerId}")
    public List<OrderOutputDTO> getAllOrdersForUserWithGivenId(@PathVariable Long customerId) {
        return orderService.getOrdersByCustomer(customerId);
    }

    @PostMapping("{customerId}")
    public OrderOutputDTO saveOrder(@PathVariable Long customerId, @RequestBody OrderInputDTO orderInputDTO){
        return this.orderService.saveOrder(orderInputDTO, customerId);
    }
}
