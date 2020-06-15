package com.advance.bank.bank.system.service;

import com.advance.bank.bank.system.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    void createCity(City city);

    void updateCity(City city);

    List<City> getAllCities();

    City getCityById(Long cityId);

    void deleteCityById(Long cityId);
}
