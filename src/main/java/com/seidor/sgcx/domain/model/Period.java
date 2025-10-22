package com.seidor.sgcx.domain.model;

import com.seidor.sgcx.infraestructure.persistence.entity.Invoicing;
import com.seidor.sgcx.infraestructure.persistence.entity.ProjectData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Period {
    private Integer id;
    private String code;
    private Integer year;
    private Integer month;
    private boolean enabled;
    private List<ProjectData> projectData;
    private List<Invoicing> invoicing;

}
