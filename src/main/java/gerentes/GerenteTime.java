package gerentes;

import classes.Time;
import java.util.ArrayList;
import java.util.List;

public class GerenteTime {
    private final List<Time> listaTimes;

    public GerenteTime() {
        this.listaTimes = new ArrayList<>();
    }
    
    public void addTime(Time time){
        this.listaTimes.add(time);
    }
    
    public boolean removeTime(int id){
        for(int i = 0; i < listaTimes.size(); i++){
            if(listaTimes.get(i).getId() == id){
                listaTimes.remove(i);
                return true; // removeu o time
            }
        }
        return false; // nao achou o id do time
    }
    
    public boolean verificaTime(int id){
        for(Time t : listaTimes){
            if(t.getId() == id){
                return true; // time existe
            }
        }
        return false; // time nao existe
    }
    
    public List<Time> getListaTime(){
        return listaTimes;
    }
    
    public Time buscarTime(int id){
        for(Time t : listaTimes){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }
}
