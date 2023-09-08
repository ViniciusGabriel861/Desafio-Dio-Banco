public class Main {
    public static void main(String[] args) {

        Cliente Vinicius = new Cliente();
        Vinicius.setNome("Vinícius");

        Conta cc = new ContaCorrente(Vinicius);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Vinicius);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Gerente gerente = new Gerente();
        gerente.analisarCredito(Vinicius.getNome(), poupanca.getSaldo(), cc.getSaldo(), 800);



    }
}
