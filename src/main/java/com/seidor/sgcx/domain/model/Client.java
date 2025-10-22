package com.seidor.sgcx.domain.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private CommercialSector commercialSector;
    private List<Project> projects;
}
