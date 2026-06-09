package classes;

public class Estadio {
    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private double valor;

    public Estadio(int id, String nome, int capacidade, String cidade, double valor) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.cidade = cidade;
        this.valor = valor;
    }
    
    public Estadio(){
        this.id = 0;
        this.nome = "";
        this.capacidade = 0;
        this.cidade = "";
        this.valor = 0;
    }
    
    public int getId() {
        return id;
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

    public double getValor() {
        return valor;
    }

    
    public void setId(int id) {
        this.id = id;
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

    public void setValor(double valor) {
        this.valor = valor;
    }
}
