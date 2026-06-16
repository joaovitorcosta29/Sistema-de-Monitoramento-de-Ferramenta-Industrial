/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.controller;

import com.sistema.de.monitoramento.monitoramento.model.FerramentaDTO;
import com.sistema.de.monitoramento.monitoramento.service.FerramentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FerramentaController {
    
    @Autowired
    private FerramentaService ferramentaService;
    
    @GetMapping("/ferramentas")
    public String listarFerramentas(Model model, FerramentaDTO ferramenta){
        List<FerramentaDTO> lista = ferramentaService.listarFerramentas(ferramenta);
        model.addAttribute("lista", lista); 
        return "listaFerramentas";
    }
    
    @PostMapping("/ferramentas/salvar")
    public String criarFerramenta(FerramentaDTO ferramenta){
        ferramentaService.criarFerramenta(ferramenta);
        return "salvarferramenta";
    }
}
