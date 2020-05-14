package com.example.querydslstudy;

import com.example.querydslstudy.entitys.Apartment;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

@Component
public class ApartmentRepository extends QuerydslRepositorySupport {
    public ApartmentRepository() {
        super(Apartment.class);
    }
}
