package com.mycompany.sistematimefutebol;

import classes.Jogador;
import file.FilePersistence;
import file.Serializador;
import gerentes.GerenteJogador;
import gerentes.GerenteTecnico;
import gerentes.GerenteEstadio;
import gerentes.GerenteTime;
import gui.TelaIncial;

public class SistemaTimeFutebol {

    public static void main(String[] args) {
        FilePersistence fp = new FilePersistence();
        Serializador serializador = new Serializador();

        String dadosJogadores = fp.loadFromFile("jogadores.csv");

        GerenteJogador gerenteJogador =
                serializador.fromCSVJogadores(dadosJogadores);
        
        int elite = 0;
        int prime = 0;
        int bom = 0;
        int medio = 0;
        int ruim = 0;
        
        for(Jogador jogador : gerenteJogador.getListaJogadores()){

            double valor = jogador.getValorTransferencia();

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
        
        String dadosTecnicos = fp.loadFromFile("tecnicos.csv");
        GerenteTecnico gerenteTecnico = serializador.fromCSVTecnicos(dadosTecnicos);
        
        String dadosEstadios = fp.loadFromFile("estadios.csv");
        GerenteEstadio gerenteEstadio = serializador.fromCSVEstadios(dadosEstadios);
        
        String dadosTimes = fp.loadFromFile("times.csv");
        GerenteTime gerenteTime = serializador.fromCSVTimes(dadosTimes, gerenteEstadio, gerenteTecnico);
        
        String dadosElencos = fp.loadFromFile("elencos.csv");
        serializador.fromCSVElencos(dadosElencos, gerenteTime, gerenteJogador);
        
        int over = 0;
        String jogador = "";
        
        for(int i = 1; i < gerenteJogador.getListaJogadores().size(); i++){
            if(gerenteJogador.buscarJogador(i).getOverall() > over){
                over = gerenteJogador.buscarJogador(i).getOverall();
                jogador = gerenteJogador.buscarJogador(i).getNome();
            }
        }
        System.out.println(over);
        System.out.println(jogador);
        
        TelaIncial telaInicial = new TelaIncial(gerenteJogador);
        
        telaInicial.setVisible(true);
    }
    
}
