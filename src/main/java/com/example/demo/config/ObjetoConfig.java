package com.example.demo.config;

import com.example.demo.vo.SaludoVo;
import com.example.demo.vo.SaludosEnIdiomasVo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "com.demo")
public class ObjetoConfig {
    private SaludosEnIdiomasVo saludoObjeto = new SaludosEnIdiomasVo();

    public void setSaludoObjeto(SaludosEnIdiomasVo saludoObjeto){this.saludoObjeto = saludoObjeto;}

    @Bean
    public SaludosEnIdiomasVo saludoObjeto(){return saludoObjeto;}
}
