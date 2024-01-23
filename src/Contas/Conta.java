package Contas;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTA = 0001;
    private int Agencia;
    private int NumeroDaConta;

    protected double saldo;

    public Conta(){
        this.Agencia = Conta.AGENCIA_PADRAO;
        this.NumeroDaConta = NUMERO_CONTA++;
    }


    public void verificarConta(){
        System.out.println(NumeroDaConta + "  " + Agencia);
    }

    public abstract double depositar(double valor);
    protected abstract double sacar(double valor);

    public void olharSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
