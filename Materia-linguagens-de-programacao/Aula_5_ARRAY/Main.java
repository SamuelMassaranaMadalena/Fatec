package Aula_5_ARRAY;

public class Main {
    public static void main(String[] args){
        String[] alunos ={"Miranata", "Savalo", "Aeronauta"};

        alunos[0] = "Mariazinha";
        System.out.println("Quantidade de alunos: " + alunos.length);

        for(String estudante:alunos){
            System.out.println(estudante);
        }
    }
}
