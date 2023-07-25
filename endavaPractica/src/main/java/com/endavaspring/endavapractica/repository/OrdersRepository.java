package com.endavaspring.endavapractica.repository;

import com.endavaspring.endavapractica.domain.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Order, Long> {
    List<Order> getOrdersByCustomerCustomerId(Long customerId);

}
