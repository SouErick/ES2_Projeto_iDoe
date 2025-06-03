package model;

public interface FormaPagamento {

    String gerarIdentificadorPagamento(Doacao doacao); 
    boolean validarPagamento(); 
    String getCodigo(); 
}