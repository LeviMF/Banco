import Contas.Conta;
import Contas.ContaCorrente;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente itau = new ContaCorrente(574, 77802, 3);
        itau.verificarConta();
    }
}
