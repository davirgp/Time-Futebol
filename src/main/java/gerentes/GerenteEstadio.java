package gerentes;

import classes.Estadio;
import java.util.ArrayList;
import java.util.List;

public class GerenteEstadio {

    private List<Estadio> listaEstadios;

    public GerenteEstadio() {
        this.listaEstadios = new ArrayList<>();
    }

    public void addEstadio(Estadio estadio){
        this.listaEstadios.add(estadio);
    }

    public boolean removeEstadio(int id){
        for(int i = 0; i < listaEstadios.size(); i++){
            if(listaEstadios.get(i).getId() == id){
                listaEstadios.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean verificaEstadio(int id){
        for(Estadio e : listaEstadios){
            if(e.getId() == id){
                return true;
            }
        }
        return false;
    }

    public List<Estadio> getListaEstadios(){
        return listaEstadios;
    }

    public Estadio buscarEstadio(int id){
        for(Estadio e : listaEstadios){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
}