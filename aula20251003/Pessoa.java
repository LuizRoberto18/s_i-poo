package aula20251003;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) throws Exception {
        if(email.contains("@")) {
            this.email = email;
        }
        else {
            throw new Exception("E-mal inválido");
        }
    }
}
Pessoa.java
Exibindo Pessoa.java…