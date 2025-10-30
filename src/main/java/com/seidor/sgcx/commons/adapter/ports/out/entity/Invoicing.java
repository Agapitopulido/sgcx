package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "invoicing")
@Getter
@Setter
public class Invoicing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_add", nullable = false)
    private Timestamp dateAdd;

    @Column(name = "date_update")
    private Timestamp dateUpdate;

    @ManyToOne
    @JoinColumn(name = "user_add_id", nullable = false)
    private User userAdd;

    @ManyToOne
    @JoinColumn(name = "user_update_id")
    private User userUpdate;

    @ManyToOne
    @JoinColumn(name = "period_id", nullable = false)
    private Period period;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "invo_wo_pep_detail_id")
    private InvoWoPepDetail invoWoPepDetail;

    @ManyToOne
    @JoinColumn(name = "payer_id")
    private Payer payer;

    @Column(nullable = false)
    private LocalDate date;

    private Integer status;
    private boolean billable;
    private boolean wip;
    private Double amount;
    private Double saleCost;
    private Double addedValue;
    private String concept;
    private String comments;

    @Column(name = "invoice_number", length = 12)
    private String invoiceNumber;
}
