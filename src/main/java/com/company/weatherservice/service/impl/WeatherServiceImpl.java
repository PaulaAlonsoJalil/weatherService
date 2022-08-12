package com.company.weatherservice.service.impl;

import com.company.weatherservice.service.WeatherService;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Override
    public Double getTemperature(String city, String country) {
        Double max = 55.0;
        Double min = -50.0;
        return Math.floor(Math.random()*(max-min+1)+min);
    }
}
