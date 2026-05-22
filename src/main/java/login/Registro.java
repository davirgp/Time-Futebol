package login;

public class Registro {
    private String usuario;
    private String senha;

    public Registro(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Registro(){
        this.usuario = "";
        this.senha = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
