package com.seidor.sgcx.domain.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Project {

    private Integer id;
    private String pep;
    private String name;
    private Client client;
    private LocalDate startDate;
    private Double soldMargin;
    private String division;
    private Area area;
    private ProjectType projectType;
    private ProjectModel projectModel;
    private User projectManager;
    private String commercial;
    private Office salesOffice;
    private Office deliveryOffice;
    private Technology technology;

}