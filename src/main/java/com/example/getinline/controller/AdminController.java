package com.example.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")//class위에 붙이면 아래 method path에 우선적으로 붙고 시작한다.
@Controller
public class AdminController {

    @GetMapping("/places")//8행에 의하여 admin/places가 된다
    public String adminPlaces(){return "admin/places";}

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId) {return "admin/place-detail";}

    @GetMapping("/events")
    public String adminEvents (){return "admin/events";}

    @GetMapping("/events/{eventsId}")
    public String adminEventDetail(@PathVariable Integer eventId){return "admin/event-detail";}
}
