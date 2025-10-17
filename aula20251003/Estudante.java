package aula20251003;

public class Estudante extends Pessoa {
    private int matricula;
    private String anoSemestreIngresso;


    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getAnoSemestreIngresso() {
        return anoSemestreIngresso;
    }
    public void setAnoSemestreIngresso(String anoSemestreIngresso) {
        this.anoSemestreIngresso = anoSemestreIngresso;
    }
}