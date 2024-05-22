package modelo;


public class Emprestimo {
    
    private String acesso;
    private String usuario;
    private String senha;
    private String porta;
    private String data_entrega;

    public Emprestimo() {
    }

    public Emprestimo(String acesso, String usuario, String senha, String porta, String data_entrega) {
        this.acesso = acesso;
        this.usuario = usuario;
        this.senha = senha;
        this.porta = porta;
        this.data_entrega = data_entrega;
    }

    public String getAcesso() {
        return acesso;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public String getPorta() {
        return porta;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

 
    
}
