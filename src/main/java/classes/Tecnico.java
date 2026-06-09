package classes;

public class Tecnico {
    private int id;
    private String nome;
    private enums.EstiloTatico estiloTatico;
    private String formacaoFavorita;
    private double salario;
    private int reputacao;

    public Tecnico(int id, String nome, enums.EstiloTatico estiloTatico, String formacaoFavorita, double salario, int reputacao) {
        this.id = id;
        this.nome = nome;
        this.estiloTatico = estiloTatico;
        this.formacaoFavorita = formacaoFavorita;
        this.salario = salario;
        this.reputacao = reputacao;
    }
    
    public Tecnico(){
        this.id = 0;
        this.nome = "";
        this.estiloTatico = null;
        this.formacaoFavorita = "";
        this.salario = 0;
        this.reputacao = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public enums.EstiloTatico getEstiloTatico() {
        return estiloTatico;
    }

    public String getFormacaoFavorita() {
        return formacaoFavorita;
    }

    public double getSalario() {
        return salario;
    }

    public int getReputacao() {
        return reputacao;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstiloTatico(enums.EstiloTatico estiloTatico) {
        this.estiloTatico = estiloTatico;
    }

    public void setFormacaoFavorita(String formacaoFavorita) {
        this.formacaoFavorita = formacaoFavorita;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setReputacao(int reputacao) {
        this.reputacao = reputacao;
    }
}
