package com.seidor.sgcx.commons.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CommercialSector {
    private Integer id;
    private String name;
    private List<Client> clients;

}
