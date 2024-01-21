package Contas;

public abstract class Conta {
    private int Agencia;
    private int NumeroDaConta;
    private int DigitoVerificador = 1;

    protected double saldo;
    public Conta(int agencia, int numeroDaConta, int digitoVerificador) {
        Agencia = agencia;
        NumeroDaConta = numeroDaConta;
        DigitoVerificador = digitoVerificador;
    }

    public void verificarConta(){
        System.out.println(Agencia);
    }

    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
    public double sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }
    public void olharSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
