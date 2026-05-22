package classes;

public class Estadio {
    private String nome;
    private int capacidade;
    private String cidade;
    private int qualidadeGramado;

    public Estadio(String nome, int capacidade, String cidade, int qualidadeGramado) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.cidade = cidade;
        this.qualidadeGramado = qualidadeGramado;
    }
    
    public Estadio(){
        this.nome = "";
        this.capacidade = 0;
        this.cidade = "";
        this.qualidadeGramado = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getCidade() {
        return cidade;
    }

    public int getQualidadeGramado() {
        return qualidadeGramado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setQualidadeGramado(int qualidadeGramado) {
        this.qualidadeGramado = qualidadeGramado;
    }
}
