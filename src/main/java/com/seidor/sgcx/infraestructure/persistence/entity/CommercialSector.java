package com.seidor.sgcx.infraestructure.persistence.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "commercial_sectors")
@Getter
@Setter
public class CommercialSector {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "commercialSector")
    private List<Client> clients;
}