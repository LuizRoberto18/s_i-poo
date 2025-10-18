import aula20251003.NivelAcademico;

public abstract class Servidor extends Pessoa {
    private String matriculaSiape;
    private String lotacao;
    private double salario;
    NivelAcademico nivelAcademico;

    public Servidor(int tipoAcademico) throws Exception {
        if (tipoAcademico == 1) {
            nivelAcademico = NivelAcademico.GRADUACAO;
        }
        if (tipoAcademico == 2) {
            nivelAcademico = NivelAcademico.ESPECILIZACAO;
        }
        if (tipoAcademico == 3) {
            nivelAcademico = NivelAcademico.MESTRADO;
        }
        if (tipoAcademico == 4) {
            nivelAcademico = NivelAcademico.DOUTORADO;
        }
    }

    public String getMatriculaSiape() {
        return matriculaSiape;
    }

    public void setMatriculaSiape(String matriculaSiape) {
        this.matriculaSiape = matriculaSiape;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    abstract void calcularSalario();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
