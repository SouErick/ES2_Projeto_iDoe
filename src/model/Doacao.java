package model;

import java.util.Date; 
                       

public class Doacao {
    private int id;
    private int data; 
    private String titulo;
    private String especificacao;
    private double valor; 
                         

    private FormaPagamento formaPagamento; // Associação 1 com FormaPagamento

    public Doacao() {
    }

    public Doacao(int id, int data, String titulo, String especificacao, int valor, FormaPagamento formaPagamento) {
        this.id = id;
        this.data = data;
        this.titulo = titulo;
        this.especificacao = especificacao;
        this.valor = valor;
        this.formaPagamento = formaPagamento; // Obrigatório pela multiplicidade 1
    }

    public void solicitarDoacao() {
        System.out.println("Método solicitarDoacao() chamado.");
    }

    public void contribuir() {
        System.out.println("Método contribuir() chamado.");
    }

    public Doacao listarPedidos() { 
                                   
        System.out.println("Método listarPedidos() chamado.");
        return this; // Retornando a própria instância como placeholder
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}