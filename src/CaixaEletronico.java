import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente itau = new ContaCorrente();
        itau.verificarConta();

        itau.depositar(0);
        itau.sacar(450);
        itau.olharSaldo();

        itau.depositar(460);
        itau.olharChequeEspecial();
        itau.olharSaldo();

        ContaCorrente inter = new ContaCorrente();
        inter.verificarConta();

        ContaPoupanca caixa = new ContaPoupanca();

        caixa.verificarConta();
        caixa.depositar(10);
        caixa.sacar(11);
    }
}
