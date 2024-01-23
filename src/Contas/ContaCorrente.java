package Contas;

public class ContaCorrente extends Conta{
    private double chequeEspecial = 500;

    public ContaCorrente(Contas.Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor){
            if ((valor - saldo)> chequeEspecial){
                System.out.println("O valor desejado para Saque é maior que o Cheque Especial");
            } else if ((valor - saldo) < chequeEspecial) {
                valor = valor - saldo;
                saldo = 0;
                chequeEspecial = chequeEspecial - valor;
            }
        }else {
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
        }else {
            saldo = saldo + valor;
        }
    }

    public void olharChequeEspecial(){
        System.out.println("Cheque especial: " + chequeEspecial);
    }
}
