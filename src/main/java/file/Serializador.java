package file;

import classes.AtributosJogador;
import classes.Jogador;
import classes.PosicaoJogador;
import gerentes.GerenteJogador;
import java.util.ArrayList;
import java.util.List;
import login.Login;

public class Serializador {
    
    public String toCSVJogadores(GerenteJogador gerente){

    String csv =
        "Id;Nome;Idade;Posicao;Overall;Salario;Transferencia;Fisico;Gols;Assistencias;"
      + "Velocidade;Finalizacao;Passe;Drible;Forca;Marcacao;Posicionamento;"
      + "Resistencia;Defesa;Reflexo;Saida\n";

    for(Jogador j : gerente.getListaJogadores()){

        csv += j.getId() + ";"
            + j.getNome() + ";"
            + j.getIdade() + ";"
            + j.getPosicao() + ";"
            + j.getOverall() + ";"
            + j.getSalario() + ";"
            + j.getValorTranferencia() + ";"
            + j.getStatusFisico() + ";"
            + j.getQtdGols() + ";"
            + j.getQtdAssistencias() + ";"

            + j.getAtributosJogador().getVelocidade() + ";"
            + j.getAtributosJogador().getFinalizacao() + ";"
            + j.getAtributosJogador().getPasse() + ";"
            + j.getAtributosJogador().getDrible() + ";"
            + j.getAtributosJogador().getForca() + ";"
            + j.getAtributosJogador().getMarcacao() + ";"
            + j.getAtributosJogador().getPosicionamento() + ";"
            + j.getAtributosJogador().getResistencia() + ";"
            + j.getAtributosJogador().getDefesa() + ";"
            + j.getAtributosJogador().getReflexo() + ";"
            + j.getAtributosJogador().getSaida()
            + "\n";
    }

    return csv;
}
    
    
    public GerenteJogador fromCSVJogadores(String data){

        GerenteJogador gerente = new GerenteJogador();

        String[] linhas = data.split("\n");

        for(int i = 1; i < linhas.length; i++){

            String[] p = linhas[i].trim().split(";");

            if(p.length >= 21){

                AtributosJogador atributos = new AtributosJogador(
                    Integer.parseInt(p[10]), // velocidade
                    Integer.parseInt(p[11]), // finalizacao
                    Integer.parseInt(p[12]), // passe
                    Integer.parseInt(p[13]), // drible
                    Integer.parseInt(p[14]), // forca
                    Integer.parseInt(p[15]), // marcacao
                    Integer.parseInt(p[16]), // posicionamento
                    Integer.parseInt(p[17]), // resistencia
                    Integer.parseInt(p[18]), // defesa
                    Integer.parseInt(p[19]), // reflexo
                    Integer.parseInt(p[20])  // saida
                );

                Jogador jogador = new Jogador(
                    Integer.parseInt(p[0]),       // id
                    p[1],                         // nome
                    Integer.parseInt(p[2]),       // idade
                    PosicaoJogador.valueOf(p[3]), // posicao
                    Integer.parseInt(p[4]),       // overall
                    Double.parseDouble(p[5]),     // salario
                    Double.parseDouble(p[6]),     // transferencia
                    Float.parseFloat(p[7]),       // fisico
                    Integer.parseInt(p[8]),       // gols
                    Integer.parseInt(p[9]),       // assistencias
                    atributos
                );

                gerente.addJogador(jogador);
            }
        }

        return gerente;
    }
}
