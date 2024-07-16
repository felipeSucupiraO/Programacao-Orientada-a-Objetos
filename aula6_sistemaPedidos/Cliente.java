package aula6_sistemaPedidos;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String endereco;
    private String numEndereco;
    private String username;
    private int telefone;
    

    public Cliente(int idCliente, String nome, String email, String endereco, String numEndereco, String username, int telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
        this.username = username;
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}