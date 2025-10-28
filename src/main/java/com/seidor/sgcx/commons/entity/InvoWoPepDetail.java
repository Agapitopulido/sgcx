package com.seidor.sgcx.commons.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "invo_wo_pep_details")
@Getter
@Setter
public class InvoWoPepDetail {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "project_name", length = 100)
    private String projectName;

    @Column(length = 2, nullable = false)
    private String division;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;
}
