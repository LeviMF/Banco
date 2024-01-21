package Contas;

public abstract class Conta {
    private int Agencia;
    private int NumeroDaConta;
    private int DigitoVerificador = 1;

    public Conta(int agencia, int numeroDaConta, int digitoVerificador) {
        Agencia = agencia;
        NumeroDaConta = numeroDaConta;
        DigitoVerificador = digitoVerificador;
    }

    public void verificarConta(){
        System.out.println(Agencia);
    }
}
