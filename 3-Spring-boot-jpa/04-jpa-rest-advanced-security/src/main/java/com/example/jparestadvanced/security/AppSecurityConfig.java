package com.example.jparestadvanced.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class AppSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/products").hasAnyRole("ADMIN","CLIENT")
                        .requestMatchers(HttpMethod.GET, "/api/products/**").hasAnyRole("ADMIN","CLIENT")
                        .requestMatchers(HttpMethod.POST, "/api/products").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/api/products").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/api/products").hasRole("ADMIN")
        );

        // use HTT Basic authentication
        http.httpBasic(Customizer.withDefaults());

        http.csrf( csrf -> csrf.disable());

        return http.build();
    }
}
