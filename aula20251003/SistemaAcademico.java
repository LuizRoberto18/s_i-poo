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

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    

    public void cadastrarProfessor() {
        Professor p = new Professor();

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome do professor? ");
        String nome = entrada.next();

        System.out.println("E-mail do professor? ");
        String email = entrada.next();

        p.setNome(nome);

        try {
            p.setEmail(email);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

     public void cadastrarEstudante() {
        Estudante e = new Estudante();

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome do Estudante? ");
        String nome = entrada.next();

        System.out.println("E-mail do Estudante? ");
        String email = entrada.next();

        e.setNome(nome);

        try {
            e.setEmail(email);
        }
        catch(Exception err) {
            System.out.println(err.getMessage());
        }
    }


    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        sistema.cadastrarProfessor();
        sistema.cadastrarEstudante();
    }
}
SistemaAcademico.java
Exibindo SistemaAcademico.java…