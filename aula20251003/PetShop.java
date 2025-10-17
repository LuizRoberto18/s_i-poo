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

public class Petshop {
    
    public void atender(Animal animal) {
        System.out.println("Atendimento iniciado...");
        System.out.println("Nome do animal: "+animal.getNome());

        animal.cagar();
        animal.mijar();

        if(animal.getClass().getSimpleName().equals("Cachorro")) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.latir();
        }

        if(animal.getClass().getSimpleName().equals("Gato")) {
            Gato gato = (Gato) animal;
            gato.miar();
        }
    }

    public static void main(String[] args) {
        Petshop petshop = new Petshop();

        Cachorro c1 = new Cachorro();
        c1.setNome("Bidu");
        c1.setIdade(3);
        petshop.atender(c1);

        Gato g1 = new Gato();
        g1.setNome("Mingau");
        petshop.atender(g1);
    }
}
Petshop.java
Exibindo Petshop.java…