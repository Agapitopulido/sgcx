package com.seidor.sgcx.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class Invoicing {

    private Integer id;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpdate;
    private User userAdd;
    private User userUpdate;
    private Period period;
    private Project project;
    private InvoWoPepDetail invoWoPepDetail;
    private Payer payer;
    private LocalDate date;
    private Integer status;
    private boolean billable;
    private boolean wip;
    private Double amount;
    private Double saleCost;
    private Double addedValue;
    private String concept;
    private String comments;
    private String invoiceNumber;
}
