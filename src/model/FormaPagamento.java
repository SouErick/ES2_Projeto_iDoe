package model;

public class FormaPagamento {
    private String codigo; // Código do pagamento ou tipo de pagamento

    private QrCode qrCode; // Associação 0..1 com QrCode

    public FormaPagamento() {
    }

    public FormaPagamento(String codigo) {
        this.codigo = codigo;
    }

    public String gerarQRCode() {
        // Lógica para gerar um QR Code, possivelmente utilizando a classe QrCode
        System.out.println("Método gerarQRCode() chamado.");
        if (this.qrCode == null) {
            this.qrCode = new QrCode(); // Instancia se não existir
        }
        return this.qrCode.gerarQRCodeInterno("Dados para o QR Code"); // Exemplo
    }

    public boolean validarPagamento() {
        System.out.println("Método validarPagamento() chamado.");
        return false;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public QrCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QrCode qrCode) {
        this.qrCode = qrCode;
    }
}