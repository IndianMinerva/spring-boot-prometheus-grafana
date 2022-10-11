package com.im.springbootprometheusgrafana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPrometheusGrafanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPrometheusGrafanaApplication.class, args);
    }

    /*@Bean
    public SecurityWebFilterChain securityWebFilterChain(
            ServerHttpSecurity http) {
        return http.authorizeExchange()
                .pathMatchers("/actuator/**").permitAll()
                .anyExchange().authenticated()
                .and().build();
    }*/
}

