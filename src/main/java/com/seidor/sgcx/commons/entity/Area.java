package com.seidor.sgcx.commons.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "areas")
@Getter @Setter
public class Area {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @Column(name = "short_name", unique = true, nullable = false, length = 5)
    private String shortName;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @OneToMany(mappedBy = "area")
    private List<AreaManager> managers;

    @OneToMany(mappedBy = "area")
    private List<Project> projects;
}