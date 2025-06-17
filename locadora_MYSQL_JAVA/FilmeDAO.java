/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author contr
 */


import java.sql.*;
import java.util.*;

public class FilmeDAO {

    public void inserir(Filme filme) throws SQLException {
        String sql = "INSERT INTO filmes (titulo, genero, ano) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getGenero());
            stmt.setInt(3, filme.getAno());
            stmt.executeUpdate();
        }
    }

    public List<Filme> listar() throws SQLException {
        List<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM filmes";
        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Filme(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getInt("ano")
                ));
            }
        }
        return lista;
    }

    public void atualizar(Filme filme) throws SQLException {
        String sql = "UPDATE filmes SET titulo=?, genero=?, ano=? WHERE id=?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getGenero());
            stmt.setInt(3, filme.getAno());
            stmt.setInt(4, filme.getId());
            stmt.executeUpdate();
        }
    }

    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM filmes WHERE id=?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Filme> buscarPorGenero(String genero) throws SQLException {
        List<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM filmes WHERE genero LIKE ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + genero + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new Filme(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getInt("ano")
                ));
            }
        }
        return lista;
    }
}

