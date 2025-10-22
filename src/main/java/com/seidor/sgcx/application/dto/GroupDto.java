package com.seidor.sgcx.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupDto {
    private Integer id;
    private String name;
    @JsonProperty("short_name")
    private String shortName;
}
