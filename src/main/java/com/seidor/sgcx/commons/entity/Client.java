package com.seidor.sgcx.commons.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "commercial_sector_id", nullable = false)
    private CommercialSector commercialSector;

    @OneToMany(mappedBy = "client")
    private List<Project> projects;
}
