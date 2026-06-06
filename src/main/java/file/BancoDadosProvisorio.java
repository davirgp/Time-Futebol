package file;

import classes.AtributosJogador;
import classes.Jogador;
import classes.PosicaoJogador;
import gerentes.GerenteJogador;

public class BancoDadosProvisorio {
    public static gerentes.GerenteJogador criarJogadores(){
        gerentes.GerenteJogador gerente = new GerenteJogador();
        
        gerente.addJogador(
            new Jogador(
                    1,
                    "Neymar",
                    33,
                    PosicaoJogador.MEI,
                    0,
                    5000000,
                    8000000,
                    100,
                    494,
                    261,
                    new AtributosJogador(
                            75,
                            80,
                            88,
                            87,
                            53,
                            33,
                            80,
                            50,
                            37,
                            11,
                            13
                    )
            )
        );
        
        return gerente;
    }
}
