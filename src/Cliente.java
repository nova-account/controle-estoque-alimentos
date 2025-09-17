public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String cnh;

    public Cliente(String nome, String cpf, String endereco, String telefone, String email, String cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnh = cnh;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }
}