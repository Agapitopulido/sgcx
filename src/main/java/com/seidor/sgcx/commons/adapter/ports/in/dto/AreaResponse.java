package com.seidor.sgcx.commons.adapter.ports.in.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AreaResponse {
    private Integer id;
    private String name;
    @JsonProperty("short_name")
    private String shortName;
}
