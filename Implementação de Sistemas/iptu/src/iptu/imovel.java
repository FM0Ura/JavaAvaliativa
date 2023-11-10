
package iptu;


class Imovel {
    String proprietario;
    double imposto;
    int mesesAtraso;
    double multa;

    public Imovel(String proprietario, double imposto, int mesesAtraso) {
        this.proprietario = proprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    public double calcularMulta() { // METODO LOGICO PARA RETORNAR A MULTA CORRETA

        if (mesesAtraso >= 0 && mesesAtraso <= 5) {
            multa = imposto * 0.01;
        } else if (mesesAtraso >= 6 && mesesAtraso <= 8) {
            multa = imposto * 0.023;
        } else if (mesesAtraso >= 9 && mesesAtraso <= 10) {
            multa = imposto * 0.03;
        } else if (mesesAtraso >= 11 && mesesAtraso <= 12) {
            multa = imposto * 0.054;
        } else if (mesesAtraso > 12) {
            multa = imposto * 0.10;
        }

        return multa;
    }
}