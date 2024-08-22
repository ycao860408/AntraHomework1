package com.antra.homework1.service.impl;

import com.antra.homework1.pojo.dto.UniversityDto;
import com.antra.homework1.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UniversityServiceImpl implements UniversityService {


    private final RestTemplate restTemplate;

    private final String UniversitiesSearchUrl = "http://universities.hipolabs.com/search";

    @Autowired
    public UniversityServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UniversityDto[] search() {
        final UniversityDto[] universities = restTemplate.getForObject(UniversitiesSearchUrl, UniversityDto[].class);
        return universities;
    }

    @Override
    public UniversityDto[] searchByCountry(String country) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(UniversitiesSearchUrl)
                .queryParam("country", country);
        final UniversityDto[] targetCountryUniversities = restTemplate.getForObject(builder.toUriString(), UniversityDto[].class);
        return targetCountryUniversities;
    }
}
