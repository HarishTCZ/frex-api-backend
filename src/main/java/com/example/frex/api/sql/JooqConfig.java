package com.example.frex.api.sql;

import org.jooq.DSLContext;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.SQLDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JooqConfig {

    @Bean
    public DSLContext dslContext(DataSource dataSource) {
        return new DefaultDSLContext(new DefaultConfiguration()
                .derive(dataSource)
                .derive(SQLDialect.POSTGRES));
    }
}
