/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.dao;

import com.raf.controlevendas.conexao.Conexao;
import com.raf.controlevendas.conexao.ConexaoMysql;
import com.raf.controlevendas.model.Usuario;

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
    }

    private String editar(Usuario usuario) {
       String sql = "UPDATE usuario SET nome = ?, usuario = ?, senha = ?, perfil = ?, estado = ? WHERE id = ?";
    }
    
}
