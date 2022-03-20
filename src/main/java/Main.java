public class Main {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.transferir(80, contaPoupanca);

        System.out.println(contaPoupanca.saldo);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }

}
