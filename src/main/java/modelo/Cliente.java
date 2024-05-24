
package modelo;

import dao.ClienteDAO;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String NotaFiscal;
    private String endereco;
    ClienteDAO cliente = new ClienteDAO();

    public Cliente() {
        this("","", "", "", "");
    }

    public Cliente(String nome, String telefone, String email, String NotaFiscal, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.NotaFiscal = NotaFiscal;
        this.endereco = endereco;
        
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getNotaFiscal() {
        return NotaFiscal;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public int getClienteid(String nome, String NotaFiscal){
        return cliente.getClienteidDAO(nome, NotaFiscal);
    }
    
    public void setNome(String nome) {
        String auxNome = this.nome;
        this.nome = nome;
        cliente.setNomeDAO(this.getClienteid(auxNome, this.NotaFiscal), nome);
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
        cliente.setNomeDAO(this.getClienteid(this.nome, this.NotaFiscal), telefone);
    }

    public void setEmail(String email) {
        this.email = email;
        cliente.setNomeDAO(this.getClienteid(this.nome, this.NotaFiscal), email);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        cliente.setNomeDAO(this.getClienteid(this.nome, this.NotaFiscal), endereco);
    }

    public void setNotaFiscal(String NotaFiscal) {
        String auxNotaFiscal = this.NotaFiscal;
        this.NotaFiscal = NotaFiscal;
        cliente.setNomeDAO(this.getClienteid(this.nome, auxNotaFiscal), NotaFiscal);
    }
    
    public void addCliente(){
        cliente.addClienteDAO(this.nome, this.telefone, this.email, this.NotaFiscal, this.endereco);
    }
    
    public void delCliente(String nome, String NotaFiscal){
        cliente.delClienteDAO(this.getClienteid(nome, NotaFiscal));
    }
    
}
