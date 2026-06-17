/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.service;

import com.sistema.de.monitoramento.monitoramento.model.FerramentaDTO;
import com.sistema.de.monitoramento.monitoramento.repository.FerramentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Aluno
 */
@Service
public class FerramentaService {

    @Autowired
    private FerramentaRepository ferramentaRepository;

    public List<FerramentaDTO> listarFerramentas() {
        return ferramentaRepository.ListarFerramentas();
    }

    public void criarFerramenta(FerramentaDTO ferramenta) {
        if (ferramenta.getNome().equals("")) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Nome não preenchido!");
        }
        if (ferramenta.getVidaUtilMaxima() <= 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Vida util inválida!");
        }
        if (ferramenta.getHorasUso() < 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Horas de uso inválidas!");
        }
        int linhasAfetadas = ferramentaRepository.criarFerramenta(ferramenta);
        if (linhasAfetadas == 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao adicionar ao banco de dados!");
        }
    }

    public void editarFerramenta(FerramentaDTO ferramenta) {
        if (ferramenta.getNome().equals("")) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Nome não preenchido!");
        }
        if (ferramenta.getVidaUtilMaxima() <= 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Vida util inválida!");
        }
        if (ferramenta.getHorasUso() < 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Horas de uso inválidas!");
        }
        int linhasAfetadas = ferramentaRepository.UpdateById(ferramenta);
        if (linhasAfetadas == 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao editar o banco de dados!");
        }

    }

    public void deletarFerramenta(FerramentaDTO ferramenta) {
        int linhasAfetadas = ferramentaRepository.UpdateById(ferramenta); //se eu troco pro metodo DeleteById esta dando erro
        if (linhasAfetadas == 0) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao deletar do banco de dados!");
        }
    }

}
