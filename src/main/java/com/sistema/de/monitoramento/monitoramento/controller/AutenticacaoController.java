/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.controller;

import com.sistema.de.monitoramento.monitoramento.model.UsuarioDTO;
import com.sistema.de.monitoramento.monitoramento.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class AutenticacaoController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String index(HttpSession session) {
        Object token = session.getAttribute("token");
        if (token == (null)) {
            return "redirect:/login";
        }
        return "redirect:/ferramentas";
    }

    @GetMapping("/login")
    public String login(Model model) {
        UsuarioDTO credenciais = new UsuarioDTO();
        model.addAttribute("credenciais", credenciais);
        return "login";
    }
    
    
}
