package classes;

public class AtributosJogador {
    private int velocidade;
    private int finalizacao;
    private int passe;
    private int drible;
    private int forca;
    private int marcacao;
    private int posicionamento;
    private int resistencia;
    
    private int defesa;
    private int reflexo;
    private int saida;

    public AtributosJogador(int velocidade, int finalizacao, int passe, int drible, int forca, int marcacao, int posicionamento, int resistencia, int defesa, int reflexo, int saida) {
        this.velocidade = velocidade;
        this.finalizacao = finalizacao;
        this.passe = passe;
        this.drible = drible;
        this.forca = forca;
        this.marcacao = marcacao;
        this.posicionamento = posicionamento;
        this.resistencia = resistencia;
        this.defesa = defesa;
        this.reflexo = reflexo;
        this.saida = saida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getFinalizacao() {
        return finalizacao;
    }

    public int getPasse() {
        return passe;
    }

    public int getDrible() {
        return drible;
    }

    public int getForca() {
        return forca;
    }

    public int getMarcacao() {
        return marcacao;
    }

    public int getPosicionamento() {
        return posicionamento;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getReflexo() {
        return reflexo;
    }

    public int getSaida() {
        return saida;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setFinalizacao(int finalizacao) {
        this.finalizacao = finalizacao;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    public void setDrible(int drible) {
        this.drible = drible;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setMarcacao(int marcacao) {
        this.marcacao = marcacao;
    }

    public void setPosicionamento(int posicionamento) {
        this.posicionamento = posicionamento;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setReflexo(int reflexo) {
        this.reflexo = reflexo;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }
    
    
}
