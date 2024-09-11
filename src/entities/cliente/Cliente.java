package entities.cliente;

import java.util.Scanner;

public class Cliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String titularConta () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");

        return sc.nextLine();
    }
}
