package app;

import gerentes.GerenteElenco;
import gerentes.GerenteEstadio;
import gerentes.GerenteJogador;
import gerentes.GerenteTecnico;
import gerentes.GerenteTime;
import gui.dialogs.CentralTransferencia;

public class ContextoSistema {

    private final GerenteJogador gerenteJogador;
    private final GerenteTecnico gerenteTecnico;
    private final GerenteEstadio gerenteEstadio;
    private final GerenteTime gerenteTime;
    private final GerenteElenco gerenteElenco;
    private CentralTransferencia centralTransferencia;

    public ContextoSistema(
            GerenteJogador gerenteJogador,
            GerenteTecnico gerenteTecnico,
            GerenteEstadio gerenteEstadio,
            GerenteTime gerenteTime,
            GerenteElenco gerenteElenco) {

        this.gerenteJogador = gerenteJogador;
        this.gerenteTecnico = gerenteTecnico;
        this.gerenteEstadio = gerenteEstadio;
        this.gerenteTime = gerenteTime;
        this.gerenteElenco = gerenteElenco;
    }

    public GerenteJogador getGerenteJogador() {
        return gerenteJogador;
    }

    public GerenteTecnico getGerenteTecnico() {
        return gerenteTecnico;
    }

    public GerenteEstadio getGerenteEstadio() {
        return gerenteEstadio;
    }

    public GerenteTime getGerenteTime() {
        return gerenteTime;
    }

    public GerenteElenco getGerenteElenco() {
        return gerenteElenco;
    }

    public CentralTransferencia getCentralTransferencia() {
        return centralTransferencia;
    }

    public void setCentralTransferencia(CentralTransferencia centralTransferencia) {
        this.centralTransferencia = centralTransferencia;
    }
}