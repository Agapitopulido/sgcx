package com.seidor.sgcx.commons.domain.model;

import com.seidor.sgcx.hProject.domain.model.Project;
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

}
