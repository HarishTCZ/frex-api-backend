package com.example.frex.api.DAO;

import org.jooq.DSLContext;
import com.example.jooq.generated.tables.Products;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JooqDAO {
    private final DSLContext dslContext;

    public JooqDAO(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<Long> getAllProducts(){
        return dslContext.select(Products.PRODUCTS.ID)
                .from(Products.PRODUCTS)
                .fetch(Products.PRODUCTS.ID);

    }
}
