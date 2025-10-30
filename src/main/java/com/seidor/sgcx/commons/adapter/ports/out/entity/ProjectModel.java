package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_models")
@Getter
@Setter
public class ProjectModel {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 20)
    private String name;
}