package com.example.querydslstudy.entitys;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "city",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<District> districtList;
}
