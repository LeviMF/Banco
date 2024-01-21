import Contas.Conta;
import Contas.ContaCorrente;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente itau = new ContaCorrente();
        itau.verificarConta();

        itau.sacar(10);
        itau.olharSaldo();

        itau.depositar(20);
        itau.olharSaldo();

        ContaCorrente inter = new ContaCorrente();
        inter.verificarConta();
    }
}
