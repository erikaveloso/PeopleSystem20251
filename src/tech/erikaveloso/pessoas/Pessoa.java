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

    public void cadastrar(){

    }

    public int obterIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telefone) {
        this.telsContato.add(telefone);
    }
}

