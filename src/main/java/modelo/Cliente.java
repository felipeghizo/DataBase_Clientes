package modelo;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String NotaFiscal;
    private String endereco;

    public Cliente() {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaFiscal(String NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
