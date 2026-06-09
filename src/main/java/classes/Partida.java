package classes;

public class Partida {
    private Time esseTime;
    private Time timeAdversario;
    private Estadio estadio;
    private String data;
    private Escalacao escalacao;

    public Partida(Time esseTime, Time timeAdversario, Estadio estadio, String data, Escalacao escalacao) {
        this.esseTime = esseTime;
        this.timeAdversario = timeAdversario;
        this.estadio = estadio;
        this.data = data;
        this.escalacao = escalacao;
    }

    public Time getEsseTime() {
        return esseTime;
    }

    public Time getTimeAdversario() {
        return timeAdversario;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public String getData() {
        return data;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public void setEsseTime(Time esseTime) {
        this.esseTime = esseTime;
    }

    public void setTimeAdversario(Time timeAdversario) {
        this.timeAdversario = timeAdversario;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.escalacao = escalacao;
    }
    
    
}
