/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NITRO5AN515-54-574Q
 */
public class ConexaoMysql implements Conexao{
    
    private final String USUARIO ="root";
    private final String SENHA = "Raf-66574";
    private final String URL = "jdbc:mysql://localhost:3306/gestao_produtos_usuarios?useTimezone=true&serverTimezone=UTC";
    private Connection conectar;

    @Override
    public Connection fazerConecao() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
            if(conectar == null){
                conectar == DriverManager.getConnection(URL,USUARIO,SENHA);
            }
            return conectar;
    }
   
        
}
