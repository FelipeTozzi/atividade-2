package RT;

import java.util.Scanner;

public class Executor {


    public static int falta() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("quantas faltas o aluno teve?");
        return leitura.nextInt();
    }

    public static int nota() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("quantas faltas o aluno teve?");
        return leitura.nextInt();
    }


    public static void main(String[] args) {

        int selec1, selec2, selec3, matric, notaT, NT;
        String[] nomesT = new String[2];
        boolean menuC = true;
        String nomeA;
        int resp1 ,nota ,faltas;
        String NovoNome;

        Scanner leitura = new Scanner(System.in);

        nomesT[0] = ("trabalho1");
        nomesT[1] = ("trabalho2");


        System.out.println("insira o nome do Professor registrando acessando: ");
        String nome = leitura.next();
        System.out.println("insira a disciplina que o Professor leciona: ");
        String disciplina = leitura.next();

        Professor professor = new Professor();

        professor.setNome(nome);
        professor.setDisciplina(disciplina);


        int Alu1Add = 0, Alu2Add = 0, Alu3Add = 0;
        Aluno aluno1 = new Aluno();
        Resultado resultado1 = new Resultado();
        Aluno aluno2 = new Aluno();
        Resultado resultado2 = new Resultado();
        Aluno aluno3 = new Aluno();
        Resultado resultado3 = new Resultado();
        aluno1.setDisciplina(disciplina);
        aluno2.setDisciplina(disciplina);
        aluno3.setDisciplina(disciplina);

        while (menuC) {

            System.out.println("Sistema de gerenciação de notas e presença.");
            System.out.println();
            System.out.println("Professor conectado: " + professor.getNome());
            System.out.println("[1] Registrar trabalho.");
            System.out.println("[2] Registrar notas de provas.");
            System.out.println("[3] Registrar faltas.");
            System.out.println("[4] Visualizar estado da turma.");
            System.out.println("[5] Adicionar alunos.");
            System.out.println("[6] Encerrar programa.");
            selec1 = leitura.nextInt();

            switch (selec1) {

                case 1:
                    System.out.println("gostaria de renomear os trabalhos (1 = sim/ 2 = não) \n Atuais nomes: " + nomesT[0] + " " + nomesT[1] + ")");
                    resp1 = leitura.nextInt();
                    if (resp1 == 1) {
                        System.out.println("selecione o trabalho (1 ou 2)");
                        selec2 = leitura.nextInt();
                        resp1 = 0;

                        switch (selec2) {
                            case 1:
                                System.out.println("escreva um novo nome");
                                NovoNome = leitura.next();
                                nomesT[0] = NovoNome;
                                break;
                            case 2:
                                System.out.println("escreva um novo nome");
                                NovoNome = leitura.next();
                                nomesT[1] = NovoNome;
                                break;
                        }

                    }
                    System.out.println("renomeação encerrada");

                    System.out.println("registrar notas dos trabalhos para qual aluno? (" + aluno1.getNome() + " = 1 / " + aluno2.getNome() + " = 2 / " + aluno3.getNome() + " = 3 )");
                    selec3 = leitura.nextInt();
                    switch (selec3) {
                        case 1:
                            if (Alu1Add != 0) {
                                System.out.println("qual é o número do trabalho (1 ou 2)");
                                NT = leitura.nextInt();
                                switch (NT) {
                                    case 1:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[0]);
                                        notaT = leitura.nextInt();
                                        resultado1.setNt1(notaT);
                                        break;
                                    case 2:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[1]);
                                        notaT = leitura.nextInt();
                                        resultado1.setNt2(notaT);
                                        break;
                                }
                            }
                            break;


                        case 2:
                            if (Alu2Add != 0) {
                                System.out.println(" qual é o número do trabalho (1 ou 2) ");
                                NT = leitura.nextInt();
                                switch (NT) {
                                    case 1:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[0]);
                                        notaT = leitura.nextInt();
                                        resultado2.setNt1(notaT);
                                        break;

                                    case 2:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[1]);
                                        notaT = leitura.nextInt();
                                        resultado2.setNt2(notaT);
                                        break;


                                }
                            }
                            break;


                        case 3:
                            if (Alu3Add != 0) {
                                System.out.println("qual é o número do trabalho (1 ou 2)");
                                NT = leitura.nextInt();
                                switch (NT) {
                                    case 1:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[0]);
                                        notaT = leitura.nextInt();
                                        resultado3.setNt1(notaT);
                                        break;
                                    case 2:
                                        System.out.println("nota do aluno " + aluno1.getNome() + " para trabalho " + nomesT[1]);
                                        notaT = leitura.nextInt();
                                        resultado3.setNt2(notaT);
                                        break;

                                }
                            }

                    }

                    break;
                        case 2:
                            System.out.println("registrar nota para qual aluno? (1/2/3)");
                            selec2 = leitura.nextInt();
                            switch (selec2) {
                                case 1:
                                    if (Alu1Add != 0) {
                                        System.out.println("coloque a nota do aluno");
                                        nota = leitura.nextInt();
                                        resultado1.setNp(nota);
                                    }
                                    break;
                                case 2:
                                    if (Alu2Add != 0) {
                                        System.out.println("coloque a nota do aluno");
                                        nota = leitura.nextInt();
                                        resultado2.setNp(nota);
                                    }
                                    break;
                                case 3:
                                    if (Alu3Add != 0) {
                                        System.out.println("coloque a nota do aluno");
                                        nota = leitura.nextInt();
                                        resultado3.setNp(nota);
                                    }
                                        break;

                            }

                            break;


                        case 3:
                            System.out.println("registrar faltas para qual aluno?");
                            selec2 = leitura.nextInt();
                            switch (selec2) {
                                case 1:
                                    if (Alu1Add != 0) {
                                        System.out.println("registre as faltas");
                                        faltas = leitura.nextInt();
                                        aluno1.setFaltas(faltas);
                                        System.out.println(aluno1.getNome() + " possui agora " + aluno1.getFaltas());
                                    }
                                    break;
                                case 2:
                                    if (Alu2Add != 0) {
                                        System.out.println("registre as faltas");
                                        faltas = leitura.nextInt();
                                        aluno2.setFaltas(faltas);
                                        System.out.println(aluno2.getNome() + " possui agora " + aluno2.getFaltas());
                                    }
                                    break;
                                case 3:
                                    if (Alu3Add != 0) {
                                        System.out.println("registre as faltas");
                                        faltas = leitura.nextInt();
                                        aluno3.setFaltas(faltas);
                                        System.out.println(aluno3.getNome() + " possui agora " + aluno3.getFaltas());
                                    }
                                    break;
                            }
                            break;

                        case 4:
                            int resfinal1, resfinal2, resfinal3;

                            resfinal1 = resultado1.resultado();
                            resfinal2 = resultado1.resultado();
                            resfinal3 = resultado1.resultado();

                            aluno1.setNota(resfinal1);
                            aluno2.setNota(resfinal2);
                            aluno3.setNota(resfinal3);

                            aluno1.designacao();
                            aluno2.designacao();
                            aluno3.designacao();


                            break;


                        case 5:
                            System.out.println("alunos possiveis (1 , 2 ,3)");
                            selec2 = leitura.nextInt();
                            switch (selec2) {
                                case 1:
                                    System.out.println("insira o nome do aluno 1");
                                    nomeA = leitura.next();
                                    aluno1.setNome(nomeA);
                                    System.out.println("insira a matricula do aluno 1");
                                    matric = leitura.nextInt();
                                    aluno1.setMatricula(matric);
                                    Alu1Add = 1;
                                    break;

                                case 2:
                                    System.out.println("insira o nome do aluno 2");
                                    nomeA = leitura.next();
                                    aluno2.setNome(nomeA);
                                    System.out.println("insira a matricula do aluno 2");
                                    matric = leitura.nextInt();
                                    aluno2.setMatricula(matric);
                                    Alu2Add = 1;
                                    break;
                                case 3:
                                    System.out.println("insira o nome do aluno 3");
                                    nomeA = leitura.next();
                                    aluno3.setNome(nomeA);
                                    System.out.println("insira a matricula do aluno 3");
                                    matric = leitura.nextInt();
                                    aluno3.setMatricula(matric);
                                    Alu3Add = 1;
                                    break;

                            }


                            break;

                        case 6:
                            System.out.println("Programa encerado");
                            menuC = false;
                            break;
                    }


            }


        }
    }



