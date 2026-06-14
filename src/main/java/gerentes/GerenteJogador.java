package gerentes;

import classes.Jogador;
import java.util.List;
import java.util.ArrayList;

public class GerenteJogador {
    private List<Jogador> listaJogadores;
    
    public GerenteJogador(){
        this.listaJogadores = new ArrayList<>();
    }
    
    public void addJogador(Jogador jogador){
        this.listaJogadores.add(jogador);
    }
    
    public boolean removeJogador(int id){
        for(int i = 0; i < listaJogadores.size(); i++){
            if(listaJogadores.get(i).getId() == id){
                listaJogadores.remove(i);
                return true; // removeu o jogador
            }
        }
        return false; // nao achou o numero da camisa
    }
    
    public boolean verificaJogador(int id){
        for(Jogador j : listaJogadores){
            if(j.getId()== id){
                return true; // jogador existe
            }
        }
        return false; // jogador nao existe
    }
    
    public List<Jogador> getListaJogadores(){
        return listaJogadores;
    }
    
    public Jogador buscarJogador(int id){
        for(Jogador j : listaJogadores){
            if(j.getId() == id){
                return j;
            }
        }
        return null;
    }
    
    public Jogador buscarJogadorNome(String nome){
        for(Jogador j : listaJogadores){
            if(j.getNome().equals(nome)){
                return j;
            }
        }
        return null;
    }
}
