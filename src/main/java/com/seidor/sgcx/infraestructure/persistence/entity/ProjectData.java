package com.seidor.sgcx.infraestructure.persistence.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "projects_data")
@Getter
@Setter
public class ProjectData {
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
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "period_id", nullable = false)
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
    private Double lastPeriodProgress;
    private Double lastPeriodProduction;
    private Double lastPeriodCost;
    private Double lastPeriodMargin;
    private Double lastPeriodInvoiced;
    private Double lastPeriodWip;
    private Double periodProgress;
    private Double periodProduction;
    private Double periodCost;
    private Double periodMargin;
    private Double periodInvoiced;
    private Double periodWip;
    private boolean blocked;
}

