package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class ProjectData {
    private Integer id;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpdate;
    private User userAdd;
    private User userUpdate;
    private Project project;
    private Period period;
    private Integer reviewStatus;
    private Double budget;
    private Double editableProduction;
    private Double actualProgress;
    private Double actualProduction;
    private Double actualCost;
    private Double actualMargin;
    private Double actualInvoiced;
    private Double actualWip;
    private LocalDate expectedEndDate;
    private Double expectedEndMargin;
    private Double expectedNextPeriodProduction;
    private Double expectedYearProduction;
    private Double periodProgress;
    private Double periodProduction;
    private Double periodCost;
    private Double periodMargin;
    private Double periodInvoiced;
    private Double periodWip;
    private boolean blocked;
}
