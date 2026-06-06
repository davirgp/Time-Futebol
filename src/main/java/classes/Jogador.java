package classes;

public class Jogador {
    private int id;
    private String nome;
    private int idade;
    private PosicaoJogador posicao;
    private int overall;
    private double salario;
    private double valorTransferencia;
    private float statusFisico;
    private int qtdGols;
    private int qtdAssistencias;
    
    private AtributosJogador atributosJogador;

    public Jogador(int id, String nome, int idade, PosicaoJogador posicao, int overall, double salario, double valorTranferencia ,float statusFisico, int qtdGols, int qtdAssistencias, AtributosJogador atributosJogador) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.overall = overall;
        this.salario = salario;
        this.valorTransferencia = valorTranferencia;
        this.statusFisico = statusFisico;
        this.qtdGols = qtdGols;
        this.qtdAssistencias = qtdAssistencias;
        this.atributosJogador = atributosJogador;
        calculaOverall();
    }
    
    public Jogador(){
        this.id = 0;
        this.nome = "";
        this.idade = 0;
        this.overall = 0;
        this.salario = 0;
        this.valorTransferencia = 0;
        this.statusFisico = 0;
        this.qtdGols = 0;
        this.qtdAssistencias = 0;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public PosicaoJogador getPosicao() {
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
    
    public AtributosJogador getAtributosJogador() {
        return atributosJogador;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPosicao(PosicaoJogador posicao) {
        this.posicao = posicao;
        calculaOverall();
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

    public void setAtributosJogador(AtributosJogador atributosJogador) {
        this.atributosJogador = atributosJogador;
        calculaOverall();
    }
    
    public void calculaOverall(){
        AtributosJogador a = this.atributosJogador;
        
        switch(posicao){
            case GOL:
                overall = (
                        a.getVelocidade() * 2 +
                        a.getFinalizacao() * 1 +
                        a.getPasse() * 5 +
                        a.getDrible() * 1 +
                        a.getForca() * 4 +
                        a.getMarcacao() * 1 +
                        a.getPosicionamento() * 14 +
                        a.getResistencia() * 4 +
                        a.getDefesa() * 27 +
                        a.getReflexo() * 28 +         
                        a.getSaida() * 14
                    )/100;
                break;
                
            case ZAG:
                overall = (
                        a.getVelocidade() * 12 +
                        a.getFinalizacao() * 2 +
                        a.getPasse() * 7 +
                        a.getDrible() * 1 +
                        a.getForca() * 18 +
                        a.getMarcacao() * 32 +
                        a.getPosicionamento() * 14 +
                        a.getResistencia() * 11 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case LD:
            case LE:
                overall = (
                        a.getVelocidade() * 19 +
                        a.getFinalizacao() * 3 +
                        a.getPasse() * 12 +
                        a.getDrible() * 6 +
                        a.getForca() * 7 +
                        a.getMarcacao() * 24 +
                        a.getPosicionamento() * 10 +
                        a.getResistencia() * 16 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case VOL:
                overall = (
                        a.getVelocidade() * 8 +
                        a.getFinalizacao() * 4 +
                        a.getPasse() * 18 +
                        a.getDrible() * 5 +
                        a.getForca() * 9 +
                        a.getMarcacao() * 26 +
                        a.getPosicionamento() * 14 +
                        a.getResistencia() * 13 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case MC:
                overall = (
                        a.getVelocidade() * 10 +
                        a.getFinalizacao() * 12 +
                        a.getPasse() * 24 +
                        a.getDrible() * 14 +
                        a.getForca() * 6 +
                        a.getMarcacao() * 7 +
                        a.getPosicionamento() * 12 +
                        a.getResistencia() * 12 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case MEI:
                overall = (
                        a.getVelocidade() * 10 +
                        a.getFinalizacao() * 18 +
                        a.getPasse() * 22 +
                        a.getDrible() * 18 +
                        a.getForca() * 4 +
                        a.getMarcacao() * 2 +
                        a.getPosicionamento() * 14 +
                        a.getResistencia() * 9 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case PD:
            case PE:
                overall = (
                        a.getVelocidade() * 22 + 
                        a.getFinalizacao() * 20 +     
                        a.getPasse() * 13 +           
                        a.getDrible() * 26 +
                        a.getForca() * 2 +
                        a.getMarcacao() * 1 +
                        a.getPosicionamento() * 8 +
                        a.getResistencia() * 5 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
                
            case ATA:
                overall = (
                        a.getVelocidade() * 13 + 
                        a.getFinalizacao() * 32 +
                        a.getPasse() * 6 +
                        a.getDrible() * 9 +
                        a.getForca() * 15 +
                        a.getMarcacao() * 1 +
                        a.getPosicionamento() * 15 +
                        a.getResistencia() * 6 +
                        a.getDefesa() * 1 +
                        a.getReflexo() * 1 +
                        a.getSaida() * 1
                    )/100;
                break;
        }
    }
}
