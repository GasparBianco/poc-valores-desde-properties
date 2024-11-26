package com.example.demo.controller;

import com.example.demo.vo.SaludoVo;
import com.example.demo.service.SaludoService;
import com.example.demo.vo.SaludosEnIdiomasVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class SaludoController {
    private final SaludoService saludoService;

    @GetMapping("/")
    public String endpointSimple(){
        return saludoService.valueSimple();
    }
    @GetMapping("/hashmap/simple")
    public Map<String, String> endpointHashMapSimple(){
        return saludoService.mapDeSaludos();
    }
    @GetMapping("/hashmap/complejo")
    public Map<String, SaludoVo> endpointHashMapComplejo(){
        return saludoService.mapComplejo();
    }
    @GetMapping("/objeto")
    public SaludosEnIdiomasVo endpointObjeto(){
        return saludoService.objeto();
    }
    @GetMapping("/lista")
    public List<String> lista(){
        return saludoService.obtenerLista();
    }
}
