/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author NITRO5AN515-54-574Q
 */
public interface Conexao {
    public Connection fazerConecao()throws SQLException;
        
    
    
}
