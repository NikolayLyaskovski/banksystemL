package com.advance.bank.bank.system.controller;


import com.advance.bank.bank.system.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/cities")
public class CityController {

    @PostMapping
    public void createCity(@RequestBody City city){

    }

    @PostMapping
    public void updateCity(@RequestBody City city){

    }

    @GetMapping
    public List<City> getCities(){
        return null;
    }

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable Long cityId){
        return null;
    }


    @DeleteMapping ("/{cityId}")
    public void deteCity(@PathVariable Long cityId){}
}
