// @author fe060311
package modelo;

import dao.ClienteDAO;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String NumeroCliente;
    private String endereco;
    ClienteDAO clienteDAO = new ClienteDAO();

    public Cliente() {
        this("","", "", "", "");
    }

    public Cliente(String nome, String telefone, String email, String NumeroCliente, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.NumeroCliente = NumeroCliente;
        this.endereco = endereco;
        
    }

    // gets
    public int getClienteid(String nome, String NotaFiscal){
        return clienteDAO.getClienteidDAO(nome, NotaFiscal);
    }
    public String getNome() {
        return clienteDAO.getNomeDAO(getClienteid(this.nome, this.NumeroCliente));
    }
    public String getTelefone() {
        return clienteDAO.getTelefoneDAO(getClienteid(this.nome, this.NumeroCliente));
    }
    public String getEmail() {
        return clienteDAO.getEmailDAO(getClienteid(this.nome, this.NumeroCliente));
    }
    public String getEndereco() {
        return clienteDAO.getEnderecoDAO(getClienteid(this.nome, this.NumeroCliente));
    }
    public int getNumeroCliente() {
        return clienteDAO.getNumeroClienteDAO(getClienteid(this.nome, this.NumeroCliente));
    }

    

    
    // sets
    public void setNome(String nome) {
        String auxNome = this.nome;
        this.nome = nome;
        clienteDAO.setNomeDAO(this.getClienteid(auxNome, this.NumeroCliente), nome);
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
        clienteDAO.setTelefoneDAO(this.getClienteid(this.nome, this.NumeroCliente), telefone);
    }

    public void setEmail(String email) {
        this.email = email;
        clienteDAO.setEmailDAO(this.getClienteid(this.nome, this.NumeroCliente), email);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        clienteDAO.setEnderecoDAO(this.getClienteid(this.nome, this.NumeroCliente), endereco);
    }

    public void setNumeroCliente(String NumeroCliente) {
        String auxNumeroCliente = this.NumeroCliente;
        this.NumeroCliente = NumeroCliente;
        clienteDAO.setNumeroClienteDAO(this.getClienteid(this.nome, auxNumeroCliente), NumeroCliente);
    }
    
    // Adiciona cliente ao banco de dados
    public void addCliente(){
        clienteDAO.addClienteDAO(this.nome, this.telefone, this.email, this.NumeroCliente, this.endereco);
    }
   // Deleta cliente do banco de dados
    public void delCliente(String nome, String NotaFiscal){
        clienteDAO.delClienteDAO(this.getClienteid(nome, NotaFiscal));
    }
    
}
