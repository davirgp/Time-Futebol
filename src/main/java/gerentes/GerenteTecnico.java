package gerentes;

import classes.Tecnico;
import java.util.ArrayList;
import java.util.List;

public class GerenteTecnico {

    private List<Tecnico> listaTecnicos;

    public GerenteTecnico() {
        this.listaTecnicos = new ArrayList<>();
    }

    public void addTecnico(Tecnico tecnico){
        this.listaTecnicos.add(tecnico);
    }

    public boolean removeTecnico(int id){
        for(int i = 0; i < listaTecnicos.size(); i++){
            if(listaTecnicos.get(i).getId() == id){
                listaTecnicos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean verificaTecnico(int id){
        for(Tecnico t : listaTecnicos){
            if(t.getId() == id){
                return true;
            }
        }
        return false;
    }

    public List<Tecnico> getListaTecnicos(){
        return listaTecnicos;
    }

    public Tecnico buscarTecnico(int id){
        for(Tecnico t : listaTecnicos){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }
}