package com.seidor.sgcx.infraestructure.persistence.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_types")
@Getter
@Setter
public class ProjectType {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 20)
    private String name;
}