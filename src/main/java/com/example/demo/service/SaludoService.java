package com.example.demo.service;

import com.example.demo.vo.SaludoVo;
import com.example.demo.vo.SaludosEnIdiomasVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class SaludoService {
    @Value("${com.demo.value}")
    private String holaMundo;
    private final Map<String, String> saludosEnIdiomas;
    private final Map<String, SaludoVo> saludoMapObjeto;
    private final SaludosEnIdiomasVo saludoObjeto;
    private final List<String> lista;
    public String valueSimple(){
        return holaMundo;
    }

    public Map<String, String> mapDeSaludos(){
        return saludosEnIdiomas;
    }

    public Map<String, SaludoVo> mapComplejo(){
        return saludoMapObjeto;
    }
    public SaludosEnIdiomasVo objeto(){
        return saludoObjeto;
    }

    public List<String> obtenerLista() {
        return lista;
    }
}
