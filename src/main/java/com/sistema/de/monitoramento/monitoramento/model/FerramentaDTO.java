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

    private Long id;
    private String nome;
    private int horasUso;
    private int vidaUtilMaxima;

    public FerramentaDTO() {
    }

    public FerramentaDTO(Long id, String nome, int horasUso, int vidaUtilMaxima) {
        this.id = id;
        this.nome = nome;
        this.horasUso = horasUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if(horasUso >= 0) {
            this.horasUso = horasUso;
        }
    }

    public int getVidaUtilMaxima() {
        return vidaUtilMaxima;
    }

    public void setVidaUtilMaxima(int vidaUtilMaxima) {
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public Double getPercentualDesgaste() {
        double percentualDesgaste = horasUso / vidaUtilMaxima * 100;
        return percentualDesgaste;
    }

}
