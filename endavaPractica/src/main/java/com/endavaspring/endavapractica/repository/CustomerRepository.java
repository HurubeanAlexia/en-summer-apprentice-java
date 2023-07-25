package com.endavaspring.endavapractica.repository;

import com.endavaspring.endavapractica.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer getCustomerByCustomerId(Long customerId);
}
