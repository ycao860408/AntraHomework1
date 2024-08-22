package com.antra.homework1.controller;

import com.antra.homework1.pojo.dto.UniversityDto;
import com.antra.homework1.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/universities")
public class UniversityController {

    @Autowired
    UniversityService universityService;


    @GetMapping("")
    public UniversityDto[] search() {
        return universityService.search();
    }

    @GetMapping("/{country}")
    public UniversityDto[] searchByCountry(@PathVariable("country") String country) {
        return universityService.searchByCountry(country);
    }
}
