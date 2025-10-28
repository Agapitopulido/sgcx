package com.seidor.sgcx.hProject.domain.model;


import com.seidor.sgcx.commons.domain.model.Area;
import com.seidor.sgcx.commons.domain.model.Client;
import com.seidor.sgcx.commons.domain.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

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

    private List<ProjectData> projectDataList;
}