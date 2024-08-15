//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int saldo = 5000;
        int opcaoMenu =0;
        Scanner menu = new Scanner (System.in);


        String menuBanco = ("""
    Bem-vindo ao banco BIBRU, digite o número da melhor opção
    1- Consultar Saldos
    2- Receber Valores
    3- Transferir valores
    4- Sair
    """);

        while (opcaoMenu != 4) {
            System.out.println(menuBanco);
            opcaoMenu = menu.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("O seu saldo é de : " + saldo);
            } else if (opcaoMenu == 2) {
                Scanner receber = new Scanner(System.in);
                System.out.println("Qual o valor que vai receber em sua conta?");
                int receberNaConta = receber.nextInt();
                saldo = saldo + receberNaConta;
                 System.out.println("Você está recebendo " + receberNaConta + " E o seu novo saldo é de: " + saldo);
            } else if (opcaoMenu ==3) {
                Scanner transferir = new Scanner(System.in);
                System.out.println("Qual o valor que vai transferir da sua conta?");
                int transferirDaConta = transferir.nextInt();
                if (transferirDaConta > saldo){
                    System.out.println("Não há saldo suficiente para realizar operação. Transação não autorizada");
                } else {
                    saldo -= transferirDaConta;
                    System.out.println("Você está transferindo " + transferirDaConta + " E o seu novo saldo é de: " + saldo);
                }
            } else {
                System.out.println("Obrigado por fazer parte do banco BiBru, volte sempre. Você saiu do Menu.");
            }

        }

    }
}