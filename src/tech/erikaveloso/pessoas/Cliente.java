package tech.erikaveloso.pessoas;

import tech.erikaveloso.auxiliares.Endereco;
import tech.erikaveloso.auxiliares.Profissao;
import tech.erikaveloso.interfaces.Cadastro;


import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Pessoa implements Cadastro {
    private String codigo;
    private Profissao profissao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }


    public void cadastrar(Scanner scanner) {
        System.out.println("\n--- Cadastro de Cliente ---");

        System.out.print("Código: ");
        this.codigo = scanner.nextLine();

        System.out.print("Nome: ");
        setNome(scanner.nextLine());

        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        setDataNascimento(LocalDate.parse(scanner.nextLine()));

        Endereco endereco = new Endereco();
        endereco.cadastrar(scanner);
        setEndereco(endereco);

    }

}