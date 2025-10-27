package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AreaManager extends User {

    private List<Area> areaList;

}
