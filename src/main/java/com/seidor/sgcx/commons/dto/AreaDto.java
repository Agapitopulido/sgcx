package com.seidor.sgcx.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AreaDto {
    private Integer id;
    private String name;
    @JsonProperty("short_name")
    private String shortName;
}
