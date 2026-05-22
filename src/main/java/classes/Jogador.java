package classes;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private int idade;
    private String posicao;
    private int overall;
    private double salario;
    private double valorTransferencia;
    private float statusFisico;
    private int qtdGols;
    private int qtdAssistencias;

    public Jogador(String nome, int numeroCamisa, int idade, String posicao, int overall, double salario, double valorTranferencia ,float statusFisico, int qtdGols, int qtdAssistencias) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.idade = idade;
        this.posicao = posicao;
        this.overall = overall;
        this.salario = salario;
        this.valorTransferencia = valorTranferencia;
        this.statusFisico = statusFisico;
        this.qtdGols = qtdGols;
        this.qtdAssistencias = qtdAssistencias;
    }
    
    public Jogador(){
        this.nome = "";
        this.numeroCamisa = 0;
        this.idade = 0;
        this.posicao = "";
        this.overall = 0;
        this.salario = 0;
        this.valorTransferencia = 0;
        this.statusFisico = 0;
        this.qtdGols = 0;
        this.qtdAssistencias = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getOverall() {
        return overall;
    }

    public double getSalario() {
        return salario;
    }
    
    public double getValorTranferencia(){
        return valorTransferencia;
    }

    public float getStatusFisico() {
        return statusFisico;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public int getQtdAssistencias() {
        return qtdAssistencias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setValorTranferencia(double valorTranferencia){
        this.valorTransferencia = valorTranferencia;
    }

    public void setStatusFisico(float statusFisico) {
        this.statusFisico = statusFisico;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public void setQtdAssistencias(int qtdAssistencias) {
        this.qtdAssistencias = qtdAssistencias;
    }
    
    
}
