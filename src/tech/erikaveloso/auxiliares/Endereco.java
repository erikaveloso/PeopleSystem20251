package tech.erikaveloso.auxiliares;

import tech.erikaveloso.interfaces.Cadastro;

import java.util.Scanner;

public class Endereco implements Cadastro {
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String complemento, String numero, String bairro, String cidade, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco(){

    }
    @Override
    public void cadastrar(Scanner scanner) {
        System.out.println("Informe os dados de endereço:");
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
    }
}