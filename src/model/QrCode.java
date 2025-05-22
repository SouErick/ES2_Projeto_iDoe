package model;

public class QrCode {
    private String dadosQr; // Atributo para armazenar os dados do QR Code gerado

    public QrCode() {
    }

    public QrCode(String dadosQr) {
        this.dadosQr = dadosQr;
    }

    // Método conforme diagrama, X pode ser a informação a ser codificada.
    // No diagrama, este método está em QrCode, mas FormaPagamento também tem um gerarQRCode().
    public String gerarQRCodeInterno(String informacao) {
        // Lógica real para gerar um QR Code (ex: usando uma biblioteca como ZXing)
        this.dadosQr = "QRCodeData[" + informacao + "]";
        System.out.println("Método interno gerarQRCode(X) chamado em QrCode. Dados: " + this.dadosQr);
        return this.dadosQr;
    }

    // Getters e Setters
    public String getDadosQr() {
        return dadosQr;
    }

    public void setDadosQr(String dadosQr) {
        this.dadosQr = dadosQr;
    }
}