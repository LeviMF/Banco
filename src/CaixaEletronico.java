import Contas.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class CaixaEletronico {
    public static void main(String[] args) {
        Cliente airton = new Cliente();
        airton.setNome("Airton");
        ContaCorrente itau = new ContaCorrente(airton);
        itau.verificarConta();

        itau.depositar(500);
        itau.sacar(600);
        itau.olharSaldo();

        itau.depositar(460);
        itau.olharChequeEspecial();
        itau.olharSaldo();

        Cliente jose = new Cliente();
        jose.setNome("José Pereira Silva");
        ContaCorrente inter = new ContaCorrente(jose);
        inter.verificarConta();


        Cliente levi = new Cliente();
        levi.setNome("Levi Modesto Ferreira");
        ContaPoupanca caixa = new ContaPoupanca(levi);

        caixa.verificarConta();
        caixa.depositar(10);
        caixa.sacar(11);

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Modesto Ferreira");
        ContaPoupanca caixa2 = new ContaPoupanca(lucas);

        caixa2.verificarConta();
        caixa2.depositar(10);
        caixa2.sacar(11);
    }
}
