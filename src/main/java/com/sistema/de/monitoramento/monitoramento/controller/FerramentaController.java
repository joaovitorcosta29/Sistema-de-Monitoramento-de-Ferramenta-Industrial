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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FerramentaController {
    
    @Autowired
    private FerramentaService ferramentaService;
    
    @GetMapping("/")
    public String index(){
        return "redirect:/ferramentas";
    }
    
    @GetMapping("/ferramentas")
    public String listarFerramentas(Model model){
        List<FerramentaDTO> lista = ferramentaService.listarFerramentas();
        model.addAttribute("ferramentas", lista); 
        return "ferramentas";
    }
    
    @PostMapping("/ferramentas/salvar")
    public String criarFerramenta(FerramentaDTO ferramenta){
        ferramentaService.criarFerramenta(ferramenta);
        return "salvarferramenta";
    }
    
}
