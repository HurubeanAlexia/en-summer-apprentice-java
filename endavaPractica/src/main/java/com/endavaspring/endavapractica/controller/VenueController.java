//package com.endavaspring.endavapractica.controller;
//
//
//import com.endavaspring.endavapractica.domain.Venue;
//import com.endavaspring.endavapractica.service.VenueService;
//import jakarta.persistence.GeneratedValue;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//
//public class VenueController {
//    private VenueService venueService;
//
//    public VenueController(VenueService venueService){
//        this.venueService = venueService;
//        System.out.println("Creating Venue Controller");
//    }
//
//    /*@GetMapping("/api/venue/{resourceId}")
//    public String getVenue(@PathVariable Long resourceId){
//        return venueService.getVenue(resourceId);
//    }*/
//
//    @GetMapping("/api/venues")
//    public List<Venue> getVenues(){
//        return venueService.getVenues();
//    }
//}
//
//
