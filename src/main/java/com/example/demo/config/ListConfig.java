package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties
public class ListConfig {
    private List<String> lista = new ArrayList<>();

    public void setLista(List<String> lista){this.lista = lista;}

    @Bean
    public List<String> lista(){return lista;}
}
