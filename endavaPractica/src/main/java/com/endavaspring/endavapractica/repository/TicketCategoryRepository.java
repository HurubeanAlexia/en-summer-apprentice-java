package com.endavaspring.endavapractica.repository;

import com.endavaspring.endavapractica.domain.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {

    TicketCategory getTicketCategoriesByTicketCategoryId(Long ticketCategoryId);

}
