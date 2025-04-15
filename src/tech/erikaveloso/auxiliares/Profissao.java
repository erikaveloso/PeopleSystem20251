package tech.erikaveloso.auxiliares;

public enum Profissao {

    PROGRAMADOR("Profissional 1"),
    QA("Profissional 2"),
    PROFESSOR("Profissional 3"),
    ENGENHEIRO("Profissional 4"),
    MEDICO("Profissional 5"),
    ADVOGADO("Profissional 6");

    private final String descricao;

    Profissao (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
