package tech.erikaveloso.app;

import tech.erikaveloso.auxiliares.Endereco;
import tech.erikaveloso.auxiliares.Telefone;
import tech.erikaveloso.pessoas.Cliente;
import tech.erikaveloso.pessoas.Funcionario;
import tech.erikaveloso.pessoas.Pessoa;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    Cliente cliente = new Cliente();
                    cliente.cadastrar(scanner);
//                    exibirCliente(cliente);
                    break;
                case "2":
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrar(scanner);
//                    exibirFuncionario(funcionario);
                    break;
                case "0":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}