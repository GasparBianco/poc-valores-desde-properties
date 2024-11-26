package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties
public class MapConfig {

    private Map<String, String> saludos = new HashMap<>();
    public void setSaludos(Map<String, String> saludos) {
        this.saludos = saludos;
    }
    @Bean
    public Map<String, String> saludosEnIdiomas() {
        return saludos;
    }
}
