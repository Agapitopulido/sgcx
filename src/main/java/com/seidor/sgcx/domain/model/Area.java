package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Area {
    private Integer id;
    private String name;
    private String shortName;
    private Group group;
    private List<User> managers;
    private List<Project> projects;
}
