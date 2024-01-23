package Contas;

public class ContaCorrente extends Conta{
    private double chequeEspecial = 500;

    @Override
    public double sacar(double valor) {
        if (saldo < chequeEspecial){
            chequeEspecial = chequeEspecial - valor;
        } else if (saldo >= valor) {
            saldo = saldo - valor;
        }
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        if (chequeEspecial < 500){
            chequeEspecial = chequeEspecial + valor;
            if (chequeEspecial > 500){
                saldo = chequeEspecial - 500;
                chequeEspecial = chequeEspecial - saldo;
            }
        }
        return saldo;
    }

    public void olharChequeEspecial(){
        System.out.println("Cheque especial: " + chequeEspecial);
    }
}
