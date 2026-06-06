package classes;

import gerentes.GerenteJogador;

public class Time {
    private String nome;
    private Estadio estadio;
    private Tecnico tecnico;
    private Escalacao escalacao;
    
    private gerentes.GerenteJogador listaJogadores;

    public Time(String nome, Estadio estadio, Tecnico tecnico, Escalacao escalacao, GerenteJogador listaJogadores) {
        this.nome = nome;
        this.estadio = estadio;
        this.tecnico = tecnico;
        this.escalacao = escalacao;
        this.listaJogadores = listaJogadores;
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

    public GerenteJogador getListaJogadores() {
        return listaJogadores;
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

    public void setListaJogadores(GerenteJogador listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
    
    
}
