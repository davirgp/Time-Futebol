package classes;

import gerentes.GerenteJogador;
import java.util.List;

public class Time {
    private int id;
    private String nome;
    private Estadio estadio;
    private Tecnico tecnico;
    private Escalacao escalacao;
    
    private List<Jogador> listaJogadores;

    public Time(int id, String nome, Estadio estadio, Tecnico tecnico, Escalacao escalacao, GerenteJogador listaJogadores) {
        this.id = id;
        this.nome = nome;
        this.estadio = estadio;
        this.tecnico = tecnico;
        this.escalacao = escalacao;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }


    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.escalacao = escalacao;
    }

    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
    
    
}
