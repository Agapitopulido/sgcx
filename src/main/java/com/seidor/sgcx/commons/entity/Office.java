package com.seidor.sgcx.commons.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "offices")
@Getter
@Setter
public class Office {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false, length = 20)
    private String name;
}