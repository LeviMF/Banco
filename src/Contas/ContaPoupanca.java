package Contas;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Contas.Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo <= 0 || saldo < valor ){
            System.out.println("Você não possui saldo suficiente para efetuar o saque!");
            System.out.println(cliente.getNome() + ", Faça um deposito!");
            return;
        }
        saldo = saldo - valor;
    }
}
