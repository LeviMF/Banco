package Contas;

public class ContaCorrente extends Conta{
    private double chequeEspecial = 500;

    public ContaCorrente(Contas.Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saldo < chequeEspecial){
            chequeEspecial = chequeEspecial - valor;
        } else if (saldo >= valor) {
            saldo = saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (chequeEspecial < 500){
            chequeEspecial = chequeEspecial + valor;
            if (chequeEspecial > 500){
                saldo = chequeEspecial - 500;
                chequeEspecial = chequeEspecial - saldo;
            }
        }
    }

    public void olharChequeEspecial(){
        System.out.println("Cheque especial: " + chequeEspecial);
    }
}
