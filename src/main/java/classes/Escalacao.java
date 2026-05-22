package classes;

import java.util.List;

public class Escalacao {
    private List<Jogador> titulares;
    private List<Jogador> reservas;
    
    private Tecnico tecnico;
    
    private String formacao;

    public Escalacao(List<Jogador> titulares, List<Jogador> reservas, Tecnico tecnico, String formacao) {
        this.titulares = titulares;
        this.reservas = reservas;
        this.tecnico = tecnico;
        this.formacao = formacao;
    }

    public List<Jogador> getTitulares() {
        return titulares;
    }

    public List<Jogador> getReservas() {
        return reservas;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setTitulares(List<Jogador> titulares) {
        this.titulares = titulares;
    }

    public void setReservas(List<Jogador> reservas) {
        this.reservas = reservas;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    
}
