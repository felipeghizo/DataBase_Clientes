// @author fe060311
package modelo;

import dao.ClienteDAO;
import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String telefone;
    private String email;
    private int NumeroCliente;
    private String endereco;
    ClienteDAO clienteDAO = new ClienteDAO();
    
    // Construtor default
    public Cliente() {
        this("","", "", 0, "");
    }
    
    // Construtor passando parâmetros
    public Cliente(String nome, String telefone, String email, int NumeroCliente, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.NumeroCliente = NumeroCliente;
        this.endereco = endereco;
        
    }

    // gets
    public int getClienteid(String nome, int NumeroCliente){
        return clienteDAO.getClienteidDAO(nome, NumeroCliente);
    }
    public String getNome() {
        return clienteDAO.getNomeDAO(getClienteid(this.nome, this.NumeroCliente));
    }
    public String getNomeID(int ID) {
        return clienteDAO.getNomeDAO(ID);
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
    public int getNumeroClienteID(int ID) {
        return clienteDAO.getNumeroClienteDAO(ID);
    }
    
    // Get lista de clientes
    public ArrayList getClientes(){
        return clienteDAO.getClientesDAO();
    }
    
    // sets
    public void setNome(String nome) {
        String auxNome = this.nome;
        this.nome = nome;
        clienteDAO.setNomeDAO(this.getClienteid(auxNome, this.NumeroCliente), nome);
    }
    public void setNomeID(int ID, String nome) {
        clienteDAO.setNomeDAO(ID, nome);
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
        clienteDAO.setTelefoneDAO(this.getClienteid(this.nome, this.NumeroCliente), telefone);
    }
    public void setTelefoneID(int ID, String telefone){
        clienteDAO.setTelefoneDAO(ID, telefone);
    }
    public void setEmail(String email) {
        this.email = email;
        clienteDAO.setEmailDAO(this.getClienteid(this.nome, this.NumeroCliente), email);
    }
    public void setEmailID(int ID, String email) {
        clienteDAO.setEmailDAO(ID, email);
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
        clienteDAO.setEnderecoDAO(this.getClienteid(this.nome, this.NumeroCliente), endereco);
    }
    public void setEnderecoID(int ID, String endereco) {
        clienteDAO.setEnderecoDAO(ID, endereco);
    }
    public void setNumeroCliente(int NumeroCliente) {
        int auxNumeroCliente = this.NumeroCliente;
        this.NumeroCliente = NumeroCliente;
        clienteDAO.setNumeroClienteDAO(this.getClienteid(this.nome, auxNumeroCliente), NumeroCliente);
    }
    public void setNumeroClienteID(int ID, int NumeroCliente) {
        clienteDAO.setNumeroClienteDAO(ID, NumeroCliente);
    }
    
    // Adiciona cliente ao banco de dados
    public void addCliente(){
        clienteDAO.addClienteDAO(this.nome, this.telefone, this.email, this.NumeroCliente, this.endereco);
    }
    // Deleta cliente do banco de dados
    public void delCliente(String nome, int numeroCliente){
        clienteDAO.delClienteDAO(this.getClienteid(nome, numeroCliente));
    }
    public void delClienteID(int ID){
        clienteDAO.delClienteDAO(ID);
    }
    
}
