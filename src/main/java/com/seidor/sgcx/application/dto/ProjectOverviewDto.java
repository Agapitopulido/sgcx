package com.seidor.sgcx.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectOverviewDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("pep")
    private String pep;
    @JsonProperty("project_name")
    private String projectName;
    @JsonProperty("client_name")
    private String clientName;
    @JsonProperty("project_manager_name")
    private String projectManagerName;

}
