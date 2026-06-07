package classes;

public class Tecnico {
    private int id;
    private String nome;
    private String estiloTatico;
    private String formacaoFavorita;
    private double salario;

    public Tecnico(int id, String nome, String estiloTatico, String formacaoFavorita, double salario) {
        this.id = id;
        this.nome = nome;
        this.estiloTatico = estiloTatico;
        this.formacaoFavorita = formacaoFavorita;
        this.salario = salario;
    }
    
    public Tecnico(){
        this.id = 0;
        this.nome = "";
        this.estiloTatico = "";
        this.formacaoFavorita = "";
        this.salario = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstiloTatico() {
        return estiloTatico;
    }

    public String getFormacaoFavorita() {
        return formacaoFavorita;
    }

    public double getSalario() {
        return salario;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstiloTatico(String estiloTatico) {
        this.estiloTatico = estiloTatico;
    }

    public void setFormacaoFavorita(String formacaoFavorita) {
        this.formacaoFavorita = formacaoFavorita;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
