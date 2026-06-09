package classes;

import gerentes.GerenteJogador;
import java.util.List;

public class Time {
    private int id;
    private String nome;
    private double saldo;
    private int torcedores;
    private Estadio estadio;
    private Tecnico tecnico;
    private Escalacao escalacao;
    
    private GerenteJogador listaJogadores;

    public Time(int id, String nome, double saldo, int torcedores, Estadio estadio, Tecnico tecnico, Escalacao escalacao, GerenteJogador listaJogadores) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.torcedores = torcedores;
        this.estadio = estadio;
        this.tecnico = tecnico;
        this.escalacao = escalacao;
        this.listaJogadores = listaJogadores;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTorcedores() {
        return torcedores;
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


    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTorcedores(int torcedores) {
        this.torcedores = torcedores;
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
