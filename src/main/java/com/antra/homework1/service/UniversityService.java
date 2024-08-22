package com.antra.homework1.service;

import com.antra.homework1.pojo.dto.UniversityDto;

public interface UniversityService {

    public UniversityDto[] search();

    public UniversityDto[] searchByCountry(String country);
}
