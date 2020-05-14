package com.example.querydslstudy.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String town;
    private String aptName;
    private Double area;
    private Integer floor;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "apartment",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<TransactionHistory> transactionHistoryList = new ArrayList<>();

}
