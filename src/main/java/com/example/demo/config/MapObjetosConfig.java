package com.example.demo.config;

import com.example.demo.vo.SaludoVo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "com.demo")
public class MapObjetosConfig {
    private Map<String, SaludoVo> saludoMapObjeto = new HashMap<>();

    public void setSaludoMapObjeto(Map<String, SaludoVo> saludoObjeto){this.saludoMapObjeto = saludoObjeto;}

    @Bean
    public Map<String, SaludoVo> saludoMapObjeto(){return saludoMapObjeto;}
}
