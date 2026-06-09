package file;

import classes.AtributosJogador;
import classes.Estadio;
import classes.Jogador;
import enums.PosicaoJogador;
import classes.Tecnico;
import classes.Time;
import gerentes.GerenteJogador;
import gerentes.GerenteTecnico;
import gerentes.GerenteEstadio;
import gerentes.GerenteTime;

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
            + j.getValorTransferencia() + ";"
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
    
    
    public String toCSVTecnicos(GerenteTecnico gerente){

        String csv =
            "Id;Nome;EstiloTatico;FormacaoFavorita;Salario;Reputacao\n";

        for(Tecnico t : gerente.getListaTecnicos()){

            csv += t.getId() + ";"
                + t.getNome() + ";"
                + t.getEstiloTatico() + ";"
                + t.getFormacaoFavorita() + ";"
                + t.getSalario() + ";"
                + t.getReputacao()
                + "\n";
        }

        return csv;
    }
    
    public GerenteTecnico fromCSVTecnicos(String data){

        GerenteTecnico gerente = new GerenteTecnico();

        String[] linhas = data.split("\n");

        for(int i = 1; i < linhas.length; i++){

            String[] p = linhas[i].trim().split(";");

            if(p.length >= 6){

                Tecnico tecnico = new Tecnico(
                    Integer.parseInt(p[0]),
                    p[1],
                    enums.EstiloTatico.valueOf(p[2]),
                    p[3],
                    Double.parseDouble(p[4]),
                    Integer.parseInt(p[5])
                );

                gerente.addTecnico(tecnico);
            }
        }

        return gerente;
    }
    
    
    public String toCSVEstadios(GerenteEstadio gerente){

        String csv =
            "Id;Nome;Capacidade;Cidade;Valor\n";

        for(Estadio e : gerente.getListaEstadios()){

            csv += e.getId() + ";"
                + e.getNome() + ";"
                + e.getCapacidade() + ";"
                + e.getCidade() + ";"
                + e.getValor()
                + "\n";
        }

        return csv;
    }
    
    public GerenteEstadio fromCSVEstadios(String data){

        GerenteEstadio gerente = new GerenteEstadio();

        String[] linhas = data.split("\n");

        for(int i = 1; i < linhas.length; i++){

            String[] p = linhas[i].trim().split(";");

            if(p.length >= 5){

                Estadio estadio = new Estadio(
                    Integer.parseInt(p[0]),
                    p[1],
                    Integer.parseInt(p[2]),
                    p[3],
                    Double.parseDouble(p[4])
                );

                gerente.addEstadio(estadio);
            }
        }

        return gerente;
    }
    
    
    public String toCSVTimes(GerenteTime gerente){

        String csv =
            "Id;Nome;Saldo;Torcedores;IdEstadio;IdTecnico\n";

        for(Time t : gerente.getListaTime()){

            csv += t.getId() + ";"
                + t.getNome() + ";"
                + t.getSaldo() + ";"
                + t.getTorcedores() + ";"
                + t.getEstadio().getId() + ";"
                + t.getTecnico().getId()
                + "\n";
        }

        return csv;
    }
    
    public GerenteTime fromCSVTimes(
        String data,
        GerenteEstadio gerenteEstadio,
        GerenteTecnico gerenteTecnico){

            GerenteTime gerente = new GerenteTime();

            String[] linhas = data.split("\n");

            for(int i = 1; i < linhas.length; i++){

                String[] p = linhas[i].trim().split(";");

                if(p.length >= 6){

                    Time time = new Time(
                        Integer.parseInt(p[0]),
                        p[1],
                        Double.parseDouble(p[2]),
                        Integer.parseInt(p[3]),
                        gerenteEstadio.buscarEstadio(
                            Integer.parseInt(p[4])
                        ),
                        gerenteTecnico.buscarTecnico(
                            Integer.parseInt(p[5])
                        ),
                        null,
                        new GerenteJogador()
                    );

                    gerente.addTime(time);
                }
            }

            return gerente;
        }
    
    
    public String toCSVElencos(GerenteTime gerente){

        String csv = "IdTime;IdJogador\n";

        for(Time time : gerente.getListaTime()){

            for(Jogador jogador :
                time.getListaJogadores().getListaJogadores()){

                csv += time.getId()
                    + ";"
                    + jogador.getId()
                    + "\n";
            }
        }

        return csv;
    }
    
    public void fromCSVElencos(
        String data,
        GerenteTime gerenteTime,
        GerenteJogador gerenteJogador){

            String[] linhas = data.split("\n");

            for(int i = 1; i < linhas.length; i++){

                String[] p = linhas[i].trim().split(";");

                if(p.length >= 2){

                    int idTime =
                        Integer.parseInt(p[0]);

                    int idJogador =
                        Integer.parseInt(p[1]);

                    Time time =
                        gerenteTime.buscarTime(idTime);

                    Jogador jogador =
                        gerenteJogador.buscarJogador(idJogador);

                    if(time != null && jogador != null){

                        time.getListaJogadores()
                            .addJogador(jogador);
                    }
                }
            }
        }
}
