package com.jara.jara_backend.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({
    "com.jara.jara_backend.business.users.repository"
})
@EnableJpaAuditing
@EnableTransactionManagement
public class DatabaseConfig {

}
