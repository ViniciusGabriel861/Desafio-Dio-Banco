
public class Gerente {

    Cliente cliente = new Cliente();
    ContaCorrente conta = new ContaCorrente(cliente);
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void analisarCredito(String nomeCliente, double saldoPoupanca, double saldoCorrente, double valorDesejado){

        if (saldoPoupanca >= 100.00 && valorDesejado <= 1000 && saldoCorrente < 500) {
            enviarMensagem(nomeCliente);

            conta.realizarEmprestimo(saldoCorrente, valorDesejado);


        }else
            System.out.println("Lamentamos, crédito indisponível.");

    }
    public void enviarMensagem(String nome){
        System.out.println("Parabéns, "+nome +" você está elegível para realizar um empréstimo conosco.");
    }


}
