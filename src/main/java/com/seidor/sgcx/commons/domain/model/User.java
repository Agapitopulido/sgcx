package com.seidor.sgcx.commons.domain.model;

import com.seidor.sgcx.hProject.domain.model.Project;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
    private String username;
    private boolean fullAccess;

    private List<Area> managedAreas;
    private List<Project> managedProjects;

}
