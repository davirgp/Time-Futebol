package com.mycompany.sistematimefutebol;

import classes.Jogador;
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
        
        int elite = 0;
        int prime = 0;
        int bom = 0;
        int medio = 0;
        int ruim = 0;
        
        for(Jogador jogador : gerente.getListaJogadores()){

            double valor = jogador.getValorTranferencia();

            if(valor >= 70000000){
                elite++;
            }
            else if(valor >= 30000000){
                prime++;
            }
            else if(valor >= 15000000){
                bom++;
            }
            else if(valor >= 5000000){
                medio++;
            }
            else{
                ruim++;
}
        }
        
        System.out.println("Elite: " + elite + "\nPrime: " + prime + "\nBom: " + bom + "\nMedio: " + medio + "\nRuim: " + ruim);

        TelaIncial telaInicial = new TelaIncial();
        
        telaInicial.setVisible(true);
    }
}
