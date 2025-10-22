package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoWoPepDetail {
    private Integer id;
    private Client client;
    private String projectName;
    private String division;
    private Area area;
}
