package RT;

public class Professor extends Pessoa{

@Override
    public void designacao() {
super.designacao();
        System.out.println(getNome() + " lecionando a matéria de " + getDisciplina());
    }
}
