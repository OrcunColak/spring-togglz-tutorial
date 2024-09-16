package com.colak.springtutorial.config;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.repository.jdbc.JDBCStateRepository;
import org.togglz.core.user.NoOpUserProvider;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class TogglzConfiguration {

    private final DataSource dataSource;

    @Bean
    public FeatureManager featureManager() {
        return new FeatureManagerBuilder()
                .featureEnum(ProductCheckFeature.class)
                .stateRepository(new JDBCStateRepository(dataSource))
                .userProvider(new NoOpUserProvider())
                .build();
    }
}
