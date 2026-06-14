package gerentes;

import classes.Jogador;
import classes.Time;
import java.util.ArrayList;
import java.util.List;

public class GerenteElenco {

    private List<Time> listaTimes;

    public GerenteElenco() {
        listaTimes = new ArrayList<>();
    }

    public void addTime(Time time){
        listaTimes.add(time);
    }

    public List<Time> getListaTimes(){
        return listaTimes;
    }

    public boolean contratarJogador(
        int idTime,
        Jogador jogador
    ){

        Time time =
            buscarTime(idTime);

        if(time == null){
            return false;
        }

        time.getListaJogadores()
            .addJogador(jogador);

        return true;
    }

    public boolean removerJogador(
        int idTime,
        int idJogador
    ){

        Time time =
            buscarTime(idTime);

        if(time == null){
            return false;
        }

        return time
            .getListaJogadores()
            .removeJogador(
                idJogador
            );
    }

    public Time buscarTimeDoJogador(
        int idJogador
    ){

        for(
            Time time :
            listaTimes
        ){

            if(
                time
                .getListaJogadores()
                .buscarJogador(
                    idJogador
                )
                != null
            ){

                return time;
            }
        }

        return null;
    }

    public boolean jogadorTemTime(
        int idJogador
    ){

        return buscarTimeDoJogador(
            idJogador
        ) != null;
    }

    public boolean transferirJogador(
        int idJogador,
        int novoIdTime
    ){

        Time atual =
            buscarTimeDoJogador(
                idJogador
            );

        Time novo =
            buscarTime(
                novoIdTime
            );

        if(
            atual == null
            ||
            novo == null
        ){

            return false;
        }

        Jogador jogador =
            atual
            .getListaJogadores()
            .buscarJogador(
                idJogador
            );

        if(
            jogador == null
        ){

            return false;
        }

        atual
            .getListaJogadores()
            .removeJogador(
                idJogador
            );

        novo
            .getListaJogadores()
            .addJogador(
                jogador
            );

        return true;
    }

    public Time buscarTime(
        int id
    ){

        for(
            Time time :
            listaTimes
        ){

            if(
                time.getId()
                ==
                id
            ){

                return time;
            }
        }

        return null;
    }
}