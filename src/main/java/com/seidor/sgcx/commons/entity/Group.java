package com.seidor.sgcx.commons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "groups")
@Getter
@Setter
public class Group {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @Column(name = "short_name", unique = true, nullable = false, length = 5)
    private String shortName;

    @OneToMany(mappedBy = "group")
    private List<Area> areas;
}