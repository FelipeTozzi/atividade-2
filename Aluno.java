package RT;

public class Aluno extends Pessoa {

    private int nota;
    private int matricula;
    private int faltas;

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(){
    }
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    @Override
    public void designacao(){

        System.out.println("Aluno: "+getNome() + " da disciplina " + getDisciplina() +" com a nota " + getNota() +" possuindo " + getFaltas() + " faltas");
    }
}
