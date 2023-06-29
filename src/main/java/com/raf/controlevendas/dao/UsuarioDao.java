/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.dao;


import com.raf.controlevendas.conexao.Conexao;
import com.raf.controlevendas.conexao.ConexaoMysql;
import com.raf.controlevendas.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author NITRO5AN515-54-574Q
 */
public class UsuarioDao {
    
    private final Conexao conexao;
    
    public UsuarioDao(){
        this.conexao = new ConexaoMysql();
    }
    
    public String salvar(Usuario usuario){
        return usuario.getId() == 0L ? adicionar(usuario) : editar(usuario);
    }

    private String adicionar(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome, usuario, senha, perfil, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conexao.fazerConecao().prepareStatement(sql);
            
            preencherValorPreparedStatement (preparedStatement, usuario);
            
            int resultado = preparedStatement.executeUpdate();
            
            return resultado == 1 ? "Usuario adicionado" : "Não foi possivel adicionar usuario";          
        } catch (SQLException e) {
            return String.format("Erro: %s", e.getMessage());
        }
    }

    private String editar(Usuario usuario) {
       String sql = "UPDATE usuario SET nome = ?, usuario = ?, senha = ?, perfil = ?, estado = ? WHERE id = ?";
       try {
            PreparedStatement preparedStatement = conexao.fazerConecao().prepareStatement(sql);
            
            preencherValorPreparedStatement (preparedStatement, usuario);
            
            int resultado = preparedStatement.executeUpdate();
            
            return resultado == 1 ? "Usuario editado" : "Não foi possivel editar usuario";          
        } catch (SQLException e) {
            return String.format("Erro: %s", e.getMessage());
        }
    }

    private void preencherValorPreparedStatement(PreparedStatement preparedStatement, Usuario usuario) {
        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getUsuario());
        preparedStatement.setString(3, usuario.get());
        preparedStatement.setString(4, usuario.getNome());
    }
    
}
