package tech.erikaveloso.app;

import tech.erikaveloso.auxiliares.Endereco;
import tech.erikaveloso.auxiliares.Telefone;
import tech.erikaveloso.pessoas.Pessoa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Erika");
        Pessoa pessoa2 = new Pessoa();


        //Data de nascimento
        LocalDate dataNascimento = LocalDate.of(1992,3,29);
        pessoa1.setDataNascimento(dataNascimento);

        //Endereco
        String logradouro = "logradouro 1";
        String complemento = "casa";
        String numero = "2A";
        String bairro = "Manaira";
        String cidade = "Joao Pessoa";
        String cep = "58038320";
        Endereco endereco1 = new Endereco(logradouro, complemento, numero, bairro, cidade, cep);
        pessoa1.setEndereco(endereco1);

        Telefone telefone1 = new Telefone();
        telefone1.setDdd("83");
        telefone1.setNumero("988900452");

        pessoa2.setNome("Luiz");
        pessoa2.setDataNascimento(dataNascimento);
        pessoa2.setEndereco(endereco1);
        pessoa2.setTelsContato(telefone1);


    }
}
