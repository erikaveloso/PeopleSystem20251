package tech.erikaveloso.pessoas;

import tech.erikaveloso.auxiliares.Endereco;
import tech.erikaveloso.auxiliares.Telefone;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

    private List<Telefone> telsContato = new ArrayList<>();

    public int obterIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<Telefone> telsContato) {
        this.telsContato = telsContato;
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telsContato.add(telefone);
    }

    protected Pessoa(){
        System.out.println("Construtor de Pessoa");
    }

}