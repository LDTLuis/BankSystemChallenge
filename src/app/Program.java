package app;

import entities.banco.Banco;
import entities.banco.TelaInicial;
import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaPoupanca;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        TelaInicial tc = new TelaInicial();
        Banco bb = new Banco();
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        boolean continuar = true;

        do {

            tc.interfaceInical();
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    cliente.setNome(cliente.titularConta());
                    bb.acaoDeposito();

                    System.out.print("Qual valor deseja depositar? ");
                    double deposito = sc.nextInt();
                    cc.depositar(deposito);
                    break;

                case 2:
                    cliente.setNome(cliente.titularConta());
                    bb.acaoTransferencia();

                    System.out.print("Qual valor deseja transferir? ");
                    double transferir = sc.nextInt();
                    cc.transferir(transferir, poupanca);


                case 3:
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Programa finalizado!");
                    break;
            }

        } while (continuar);

    }
}

