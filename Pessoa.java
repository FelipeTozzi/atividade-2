package RT;

public abstract class Pessoa {

    private String nome ,disciplina;

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void designacao(){

        System.out.println("pessoa "+getNome() + " da disciplina " + getDisciplina());
    }

}
