package com.seidor.sgcx.commons.adapter.ports.out.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payers")
@Getter
@Setter
public class Payer {
    @Id
    private Integer id;

    @Column(length = 50)
    private String name;
}