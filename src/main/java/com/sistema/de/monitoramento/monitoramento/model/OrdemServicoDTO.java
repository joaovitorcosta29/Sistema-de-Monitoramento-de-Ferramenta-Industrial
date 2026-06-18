/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.model;

import java.time.LocalDateTime;

/**
 *
 * @author Aluno
 */
public class OrdemServicoDTO {
    private Long idOrdemServico;
    private Long idFerramenta;
    private UsuarioDTO tecnico; 
    private String descricao;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;
    private String status;

    public OrdemServicoDTO() {
    }

    public OrdemServicoDTO(Long idOrdemServico, Long idFerramenta, UsuarioDTO tecnico, String descricao, LocalDateTime dataAbertura, LocalDateTime dataFechamento, String status) {
        this.idOrdemServico = idOrdemServico;
        this.idFerramenta = idFerramenta;
        this.tecnico = tecnico;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
    }

    public Long getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(Long idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public Long getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(Long idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public UsuarioDTO getTecnico() {
        return tecnico;
    }

    public void setTecnico(UsuarioDTO tecnico) {
        this.tecnico = tecnico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
