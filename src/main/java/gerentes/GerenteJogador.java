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
    
    public boolean removeJogador(int numeroCamisa){
        for(int i = 0; i < listaJogadores.size(); i++){
            if(listaJogadores.get(i).getNumeroCamisa() == numeroCamisa){
                listaJogadores.remove(i);
                return true; // removeu o jogador
            }
        }
        return false; // nao achou o numero da camisa
    }
    
    public boolean verificaJogador(int numeroCamisa){
        for(Jogador j : listaJogadores){
            if(j.getNumeroCamisa() == numeroCamisa){
                return true; // jogador existe
            }
        }
        return false; // jogador nao existe
    }
}
