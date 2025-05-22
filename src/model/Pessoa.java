package model;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;
    protected String telefone;
    protected String cep; // CEP também está em Endereco, verificar a necessidade aqui.
                          // Pode ser o CEP principal da pessoa.

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String senha, String telefone, String cep) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cep = cep;
    }

    public boolean login() {
        // Implementação do login
        System.out.println("Método login() chamado.");
        return false;
    }

    public boolean cadastrar() {
        // Implementação do cadastro
        System.out.println("Método cadastrar() chamado.");
        return false;
    }

    public boolean cancelar() {
        // Implementação do cancelamento
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
}