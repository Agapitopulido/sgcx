package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String pep;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    private Double soldMargin;

    @Column(length = 2, nullable = false)
    private String division;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;

    @ManyToOne
    @JoinColumn(name = "project_type_id", nullable = false)
    private ProjectType projectType;

    @ManyToOne
    @JoinColumn(name = "project_model_id", nullable = false)
    private ProjectModel projectModel;

    @ManyToOne
    @JoinColumn(name = "project_manager_id", nullable = false)
    private User projectManager;

    @Column(nullable = false, length = 50)
    private String commercial;

    @ManyToOne
    @JoinColumn(name = "sales_office_id", nullable = false)
    private Office salesOffice;

    @ManyToOne
    @JoinColumn(name = "delivery_office_id", nullable = false)
    private Office deliveryOffice;

    @ManyToOne
    @JoinColumn(name = "technology_id", nullable = false)
    private Technology technology;
}