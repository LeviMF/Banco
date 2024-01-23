package Contas;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTA = 1;
    private int Agencia;
    private int NumeroDaConta;
    protected Cliente cliente;

    protected double saldo;

    public Conta(Cliente cliente){
        this.Agencia = Conta.AGENCIA_PADRAO;
        this.NumeroDaConta = NUMERO_CONTA++;
        this.cliente = cliente;
    }


    public void verificarConta(){
        System.out.println(NumeroDaConta + "  " + Agencia);
    }

    public abstract void depositar(double valor);
    protected abstract void sacar(double valor);

    public void olharSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
