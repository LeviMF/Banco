package Contas;

public class ContaPoupanca extends Conta{
    @Override
    public double depositar(double valor) {
        saldo = saldo + valor;
        return saldo;
    }

    @Override
    public double sacar(double valor) {
        if (saldo <= 0 || saldo < valor ){
            System.out.println("Você não possui saldo suficiente para efetuar o saque!");
            return 0;
        }
        saldo = saldo - valor;
        return saldo;
    }
}
