/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.model;

/**
 *
 * @author Aluno
 */
public class FerramentaDTO {

    private Long idFerramenta;
    private String nome;
    private int horasUso;
    private int vidaUtilMaxima;
    private String status;
    private UsuarioDTO responsavel;

    public FerramentaDTO() {
    }

    public FerramentaDTO(Long idFerramenta, String nome, int horasUso, int vidaUtilMaxima, String status, UsuarioDTO responsavel) {
        this.idFerramenta = idFerramenta;
        this.nome = nome;
        this.horasUso = horasUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
        this.status = status;
        this.responsavel = responsavel;
    }

    public Long getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(Long idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public int getVidaUtilMaxima() {
        return vidaUtilMaxima;
    }

    public void setVidaUtilMaxima(int vidaUtilMaxima) {
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UsuarioDTO getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(UsuarioDTO responsavel) {
        this.responsavel = responsavel;
    }
    
    public double getPercentualDesgaste() {
        return (horasUso / vidaUtilMaxima) * 100;
    }

}
