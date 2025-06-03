package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;
    protected String telefone;
    protected String cep; 


    protected List<Endereco> enderecos;

    public Pessoa() {
        this.enderecos = new ArrayList<>();
    }

    public Pessoa(String nome, String email, String senha, String telefone, String cep) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cep = cep;
        this.enderecos = new ArrayList<>();
    }

    public boolean login() {
        System.out.println("Método login() chamado para: " + this.email);
        return false;
    }

    public boolean cadastrar() {
        System.out.println("Método cadastrar() chamado para: " + this.nome);

        return false;
    }

    public boolean cancelar() {
        System.out.println("Método cancelar() chamado.");
        return false;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEndereco(Endereco endereco) {
        if (this.enderecos == null) {
            this.enderecos = new ArrayList<>();
        }
        this.enderecos.add(endereco);
    }

    public void removeEndereco(Endereco endereco) {
        if (this.enderecos != null) {
            this.enderecos.remove(endereco);
        }
    }
}