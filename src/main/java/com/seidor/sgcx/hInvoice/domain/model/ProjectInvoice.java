package com.seidor.sgcx.hInvoice.domain.model;

import com.seidor.sgcx.commons.domain.model.Area;
import com.seidor.sgcx.commons.domain.model.Client;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectInvoice {

    private String name;
    private Client client;
    private String division;
    private Area area;

}
