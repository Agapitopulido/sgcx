package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(unique = true, nullable = false, length = 25)
    private String username;

    @Column(name = "full_access", nullable = false)
    private boolean fullAccess;

    @OneToMany(mappedBy = "user")
    private List<AreaManager> managedAreas;

    @OneToMany(mappedBy = "projectManager")
    private List<Project> managedProjects;

    @OneToMany(mappedBy = "userAdd")
    private List<ProjectData> createdProjectData;

    @OneToMany(mappedBy = "userUpdate")
    private List<ProjectData> updatedProjectData;
}