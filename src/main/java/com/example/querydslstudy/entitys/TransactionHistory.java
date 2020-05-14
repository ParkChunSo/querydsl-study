package com.example.querydslstudy.entitys;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Double pyPrice;
    @Enumerated(EnumType.STRING)
    private DealType type;
    private LocalDate date;

    public enum DealType{
        BARGAIN, CHARTER, RENT
    }
}
