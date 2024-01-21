import Contas.Conta;
import Contas.ContaCorrente;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente itau = new ContaCorrente(574, 77802, 3);

        itau.sacar(10);
        itau.olharSaldo();

        itau.depositar(20);
        itau.olharSaldo();
    }
}
