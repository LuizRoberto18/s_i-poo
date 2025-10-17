package aula20251003;

public class CachorroDomestico extends Cachorro {
    
    public void receberCuidadosEspeciais() {
        System.out.println("Tosa e Higiene feitas");
    }

    public static void main(String[] args) {
        
        CachorroDomestico cachorroDomestico = new CachorroDomestico();
        cachorroDomestico.latir();
        cachorroDomestico.rosnar();
        cachorroDomestico.mijar();
        cachorroDomestico.cagar();
    }
}