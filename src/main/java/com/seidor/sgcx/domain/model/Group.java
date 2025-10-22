package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Group {
    private Integer id;
    private String name;
    private String shortName;
    private List<Area> areas;

}
