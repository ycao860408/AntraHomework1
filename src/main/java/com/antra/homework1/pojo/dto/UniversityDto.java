package com.antra.homework1.pojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDto {
    String country;
    String[] domains;
    @JsonProperty("state-province")
    String stateProvince;
    @JsonProperty("web_pages")
    String[] webPages;
    String name;
    @JsonProperty("alpha_two_code")
    String alphaTwoCode;
}
