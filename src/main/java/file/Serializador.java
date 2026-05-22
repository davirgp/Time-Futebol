package file;

import java.util.ArrayList;
import java.util.List;
import login.Login;

public class Serializador {
    
    public String toCSVLogin(List<Login> login){
        String csv = "Usuário;Senha;\n";
        for(Login l : login){
            csv += l.getUsuario()+ ";"
                    +l.getSenha()+ ";\n";
        }
        return csv;
    }
    
    public List<Login> fromCSVHospedes(String data){
        List<Login> listaLogin = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 2){
                Login login = new Login();
                login.setUsuario(partes[0]);
                login.setSenha(partes[1]);
                
                listaLogin.add(login);
            }
        }
        return listaLogin;
    }
}
