public class Main {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(matheus);
        Conta cp = new ContaPoupanca(matheus);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
