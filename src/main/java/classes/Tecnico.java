package classes;

public class Tecnico {
    private String nome;
    private String estiloTatico;
    private String formacaoFavorita;
    private double salario;

    public Tecnico(String nome, String estiloTatico, String formacaoFavorita, double salario) {
        this.nome = nome;
        this.estiloTatico = estiloTatico;
        this.formacaoFavorita = formacaoFavorita;
        this.salario = salario;
    }
    
    public Tecnico(){
        this.nome = "";
        this.estiloTatico = "";
        this.formacaoFavorita = "";
        this.salario = 0;
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
