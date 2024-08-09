import java.util.Scanner;

public class ContaTerminal  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declarando variaveis!
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        //Inicio da Implentação do Programa.

        System.out.println("Por favor informe seu cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor informe o número da agencia: ");
        agencia = sc.nextLine();
        System.out.println("Informe o numero da sua conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

      //Informando os dados da Conta

        System.out.println("Ola "+nomeCliente+ ", obrigado por criar um conta em nosso banco, sua agência "+ agencia+ " conta número "+ numeroConta+ " e seu saldo R$"+saldo+ "0 e está disponível epara saque!");
        System.out.println("Informações detalhadas!");
        System.out.println("Banco DIO-ME");
        System.out.println("--- Impressão de Extrato ----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero de conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo+ "0");



    }


    
}
