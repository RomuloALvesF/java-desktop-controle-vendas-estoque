/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raf.controlevendas.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author NITRO5AN515-54-574Q
 */
public class Produto {
    private long id;
    private String nome;
    private double preco;
    private String descricao;
    private String validade;
    private int quantidade;
    private Categoria categoria;
    private Usuario usuario;
    private LocalDateTime dataHoraCadastro;

    public Produto() {
    }

    public Produto(long id, String nome, double preco, String descricao, String validade, int quantidade, Categoria categoria, Usuario usuario, LocalDateTime dataHoraCadastro) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.validade = validade;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.usuario = usuario;
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }
    
    
    
    
    
}
