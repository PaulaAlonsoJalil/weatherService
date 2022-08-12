package com.company.weatherservice.controller;

import com.company.weatherservice.WeatherServiceApplication;
import com.company.weatherservice.service.impl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherServiceImpl weatherService;

    @GetMapping
    public Double getTemperature(@RequestParam String city, @RequestParam String country) {

        return weatherService.getTemperature(city,country);
    }
}
