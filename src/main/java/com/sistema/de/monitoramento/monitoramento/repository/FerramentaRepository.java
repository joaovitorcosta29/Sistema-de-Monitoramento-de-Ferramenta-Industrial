/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.de.monitoramento.monitoramento.repository;

import com.sistema.de.monitoramento.monitoramento.model.FerramentaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class FerramentaRepository {

    public int criarFerramenta(FerramentaDTO ferramenta) {
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement("INSERT INTO tb_ferramenta(nome, horas_uso, vida_util_maxima) VALUES (?,?,?)");

            stmt.setString(1, ferramenta.getNome());
            stmt.setInt(2, ferramenta.getHorasUso());
            stmt.setInt(3, ferramenta.getVidaUtilMaxima());

            linhasAfetadas = stmt.executeUpdate();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<FerramentaDTO> ListarFerramentas() {
        List<FerramentaDTO> listar = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conn.prepareStatement("SELECT * FROM tb_ferramenta");

            rs = stmt.executeQuery();

            while (rs.next()) {
                FerramentaDTO ferramenta = new FerramentaDTO();

                ferramenta.setIdFerramenta(rs.getLong("id_ferramenta"));
                ferramenta.setNome(rs.getString("nome"));
                ferramenta.setHorasUso(rs.getInt("horas_uso"));
                ferramenta.setVidaUtilMaxima(rs.getInt("vida_util_maxima"));

                listar.add(ferramenta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listar;
    }

    public int DeleteById(int id) { //No metodo deletar só passa id. Por isso só passa ele nos parâmetros.
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement("DELETE FROM tb_ferramenta WHERE id_ferramenta = ?");
            stmt.setLong(1, id);  //No metodo deletar só passa id. Por isso só passa ele nos parametros

            linhasAfetadas = stmt.executeUpdate();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int UpdateById(FerramentaDTO ferramenta){
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement("UPDATE tb_ferramenta set nome = ?, horas_uso = ?, vida_util_maxima = ? WHERE id_ferramenta = ?");
            stmt.setString(1, ferramenta.getNome());
            stmt.setInt(2, ferramenta.getHorasUso());
            stmt.setInt(3, ferramenta.getVidaUtilMaxima());
            stmt.setLong(4, ferramenta.getIdFerramenta());
            
            linhasAfetadas = stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
