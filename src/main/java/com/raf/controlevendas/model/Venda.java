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
public class Venda {
    private long id;
    private Cliente cliente;
    private Usuario usuario;
    private String formaPagamento;
    private BigDecimal totalVenda;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private BigDecimal desconto;
    private LocalDateTime dataHoraVenda;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(long id, Cliente cliente, Usuario usuario, String formaPagamento, BigDecimal totalVenda, BigDecimal valorPago, BigDecimal troco, BigDecimal desconto, LocalDateTime dataHoraVenda, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.formaPagamento = formaPagamento;
        this.totalVenda = totalVenda;
        this.valorPago = valorPago;
        this.troco = troco;
        this.desconto = desconto;
        this.dataHoraVenda = dataHoraVenda;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(BigDecimal totalVenda) {
        this.totalVenda = totalVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
    
}
