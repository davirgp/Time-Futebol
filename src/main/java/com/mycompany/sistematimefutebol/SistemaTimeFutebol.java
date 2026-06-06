package com.mycompany.sistematimefutebol;

import file.FilePersistence;
import file.Serializador;
import gerentes.GerenteJogador;
import gui.TelaIncial;

public class SistemaTimeFutebol {

    public static void main(String[] args) {
        FilePersistence fp = new FilePersistence();
        Serializador serializador = new Serializador();

        String dados = fp.loadFromFile("jogadores.csv");

        GerenteJogador gerente =
                serializador.fromCSVJogadores(dados);
        
        for(var jogador : gerente.getListaJogadores()){
            System.out.println(jogador.getNome());
        }

        TelaIncial telaInicial = new TelaIncial();
        
        telaInicial.setVisible(true);
    }
}
