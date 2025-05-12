package tech.erikaveloso.auxiliares;

import tech.erikaveloso.interfaces.Cadastro;

import java.util.Scanner;

public class Telefone implements Cadastro {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone(){}
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void cadastrar(Scanner scanner) {
        while (true) {
            Telefone telefone = new Telefone();
            System.out.print("DDD: ");
            telefone.setDdd(scanner.nextLine());
            System.out.print("Número: ");
            telefone.setNumero(scanner.nextLine());

            System.out.print("Deseja adicionar outro telefone? (s/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("s")) break;
        }
    }
}