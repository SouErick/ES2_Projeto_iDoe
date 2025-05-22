package model;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    private List<Endereco> enderecos; // Associação 1..* com Endereco
    private List<Doacao> doacoesRealizadas; // Associação 0..* com Doacao

    public PessoaJuridica() {
        super();
        this.enderecos = new ArrayList<>();
        this.doacoesRealizadas = new ArrayList<>();
    }

    public PessoaJuridica(String nome, String email, String senha, String telefone, String cepPessoa,
                          String cnpj, String razaoSocial) {
        super(nome, email, senha, telefone, cepPessoa);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.enderecos = new ArrayList<>();
        this.doacoesRealizadas = new ArrayList<>();
    }

    public boolean validarCNPJ() {
        // Implementação da validação de CNPJ
        System.out.println("Método validarCNPJ() chamado.");
        // Lógica de validação do CNPJ aqui
        return this.cnpj != null && !this.cnpj.trim().isEmpty(); // Exemplo simples
    }

    public boolean criarPedidoDoacao(Doacao doacao) {
        // Implementação da criação de pedido de doação
        System.out.println("Método criarPedidoDoacao() chamado.");
        this.doacoesRealizadas.add(doacao);
        return true;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    public List<Doacao> getDoacoesRealizadas() {
        return doacoesRealizadas;
    }

    public void setDoacoesRealizadas(List<Doacao> doacoesRealizadas) {
        this.doacoesRealizadas = doacoesRealizadas;
    }

    public void addDoacaoRealizada(Doacao doacao) {
        if (this.doacoesRealizadas == null) {
            this.doacoesRealizadas = new ArrayList<>();
        }
        this.doacoesRealizadas.add(doacao);
    }
}