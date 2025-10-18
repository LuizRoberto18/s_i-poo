package aula20251003;

public abstract class Animal {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public abstract void cagar() {
        System.out.println(getNome() +" está cagando");
    }

    public void mijar() {
        System.out.println(getNome() + " está mijando");
    }
}