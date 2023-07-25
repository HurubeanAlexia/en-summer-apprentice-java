package com.endavaspring.endavapractica.mapper;

import com.endavaspring.endavapractica.domain.TicketCategory;
import com.endavaspring.endavapractica.dto.TicketCategoryDTO;

import java.util.ArrayList;
import java.util.List;

public class TicketCategoryMapper {


    public static TicketCategoryDTO convertModelToDTO(TicketCategory ticketCategory){
        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
        ticketCategoryDTO.setTicketCategoryId(ticketCategory.getTicketCategoryId());
        ticketCategoryDTO.setDescription(ticketCategory.getTicketCategoryDescription());
        ticketCategoryDTO.setPrice((ticketCategory.getPrice()));
        return ticketCategoryDTO;


    }

    public static List<TicketCategoryDTO> convertModelListToOutputDTOList(List<TicketCategory> ticketCategories){
        List<TicketCategoryDTO> ticketCategoryDTOS = new ArrayList<>();
        for(TicketCategory ticketCategory: ticketCategories){
            ticketCategoryDTOS.add(convertModelToDTO(ticketCategory));

        }
        return ticketCategoryDTOS;
    }
}



