package com.seidor.sgcx.commons.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Period {
    private Integer id;
    private String code;
    private Integer year;
    private Integer month;
    private boolean enabled;
}
