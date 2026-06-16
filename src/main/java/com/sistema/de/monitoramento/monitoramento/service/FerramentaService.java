/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.service;

import com.sistema.de.monitoramento.monitoramento.model.FerramentaDTO;
import com.sistema.de.monitoramento.monitoramento.repository.FerramentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class FerramentaService {
    
    @Autowired
    private FerramentaRepository ferramentaRepository;
    
    public List<FerramentaDTO> listarFerramentas(FerramentaDTO ferramenta){
        return ferramentaRepository.ListarFerramentas();
    }
    
    public int criarFerramenta(FerramentaDTO ferramenta){
        return ferramentaRepository.criarFerramenta(ferramenta);
    }
    
}
