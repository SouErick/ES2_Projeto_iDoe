package model;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;
    private String tipoSanguineo;
    private String rg;
    private String sexo;
    private String foto; // Geralmente, o caminho para a foto ou um array de bytes

    private Endereco endereco; // Associação 0..1 com Endereco

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, String email, String senha, String telefone, String cepPessoa,
                        String cpf, int idade, String tipoSanguineo, String rg, String sexo, String foto) {
        super(nome, email, senha, telefone, cepPessoa);
        this.cpf = cpf;
        this.idade = idade;
        this.tipoSanguineo = tipoSanguineo;
        this.rg = rg;
        this.sexo = sexo;
        this.foto = foto;
    }

    public boolean editarPerfil() {
        // Implementação da edição de perfil
        System.out.println("Método editarPerfil() chamado.");
        return false;
    }

    public boolean validarCPF() {
        // Implementação da validação de CPF
        System.out.println("Método validarCPF() chamado.");
        // Lógica de validação do CPF aqui
        return this.cpf != null && !this.cpf.trim().isEmpty(); // Exemplo simples
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}