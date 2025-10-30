package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "area_managers")
@Getter
@Setter
public class AreaManager {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}