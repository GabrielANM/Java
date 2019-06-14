package Lista2_Exercicio1.modelo.modelo;

public class Aula {
    public Materia materia;
    public String horarioInicio;
    public String horarioFinal;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Aula(Materia materia, String horarioInicio, String horarioFinal) {
        this.materia = materia;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "materia=" + materia +
                ", horarioInicio='" + horarioInicio + '\'' +
                ", horarioFinal='" + horarioFinal + '\'' +
                '}';
    }
}
