Pular para o conteúdo principal
Google Sala de Aula
Sala de Aula
PROO BSI - 2025.1
BSI - Programação Orientada a Objetos
Detalhes do material
Códigos da aula
Kenji Kamei
•
4 de out.

Animal.java
Java

AreaFormacao.java
Java

Cachorro.java
Java

CachorroDomestico.java
Java

Estudante.java
Java

Gato.java
Java

NivelAcademico.java
Java

Pessoa.java
Java

Petshop.java
Java

Professor.java
Java

SistemaAcademico.java
Java
Comentários da turma

Adicionar comentário para a turma...

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