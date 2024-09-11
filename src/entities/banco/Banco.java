package entities.banco;

import entities.conta.Conta;

import java.util.List;
import java.util.Scanner;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String acaoDeposito() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja depositar (S/N)? ");

        return String.valueOf(sc.nextLine().charAt(0));
    }

    public String acaoTransferencia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja transferir? (S/N)? ");

        return String.valueOf(sc.nextLine().charAt(0));
    }

}
