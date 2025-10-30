package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "periods")
@Getter
@Setter
public class Period {
    @Id
    private Integer id;

    @Column(unique = true, length = 7)
    private String code;

    private Integer year;
    private Integer month;
    private boolean enabled;

    @OneToMany(mappedBy = "period")
    private List<ProjectData> projectData;

    @OneToMany(mappedBy = "period")
    private List<Invoicing> invoicing;
}