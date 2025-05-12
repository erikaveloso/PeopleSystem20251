package tech.erikaveloso.pessoas;

import tech.erikaveloso.auxiliares.Cargo;
import tech.erikaveloso.interfaces.Cadastro;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa implements Cadastro {
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public void reajustarSalario(double percentual) {
        salario += salario * percentual / 100.0;
    }

    public void promover(Cargo novoCargo) {
        cargo = novoCargo;
    }

    @Override
    public void cadastrar(Scanner scanner) {
        System.out.println("Aqui cadastra o funcionário!");
    }
    @Override
    public String toString() {

        return null;
    }
}