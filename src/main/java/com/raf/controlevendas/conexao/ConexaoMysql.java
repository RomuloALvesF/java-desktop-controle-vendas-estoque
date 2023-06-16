/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.conexao;

import com.sun.source.tree.TryTree;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NITRO5AN515-54-574Q
 */
public class ConexaoMysql implements Conexao{
    
    private static final String USUARIO ="root";
    private static final String SENHA = "Raf-66574";
    private static final String URL = "jdbc:mysql://localhost:3306/gestao_produtos_usuarios?useTimezone=true&serverTimezone=UTC";
    private static Connection conectar;

    @Override
    public Connection fazerConecao() throws SQLException {
        if (conectar == null) {
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }

    
   
        
}
