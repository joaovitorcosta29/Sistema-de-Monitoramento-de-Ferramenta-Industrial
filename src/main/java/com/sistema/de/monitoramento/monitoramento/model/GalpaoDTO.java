/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.model;

/**
 *
 * @author Aluno
 */
public class GalpaoDTO {
    private Long idGalpao;
    private String nome;
    private boolean ativo;

    public GalpaoDTO() {
    }

    public GalpaoDTO(Long idGalpao, String nome, boolean ativo) {
        this.idGalpao = idGalpao;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Long getIdGalpao() {
        return idGalpao;
    }

    public void setIdGalpao(Long idGalpao) {
        this.idGalpao = idGalpao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
