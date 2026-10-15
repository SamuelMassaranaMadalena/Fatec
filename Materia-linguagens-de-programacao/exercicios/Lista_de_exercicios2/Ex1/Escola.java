package exercicios.Lista_de_exercicios2.Ex1;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno("Nlberto", "bertinhonilgrau@zokstique.com", false, false, 8, true);
        Aluno aluno_2 = new Aluno("Nilton", "notilMorisk@zokstique.com", false, true, 6, true);
        Aluno aluno_3 = new Aluno("zomeu", "naoehromeu@zokstique.com", true, true, 2, false);

        Aluno[] alunos = {aluno_1, aluno_2, aluno_3};
        
        
        Professor prof_1 = new Professor("Regisnaldo", 1, "calmo", 9, "pindamoiangaba");
        Professor prof_2 = new Professor("jonas", 3, "incomodado", 4, "Se acalmem");
        Professor prof_3 = new Professor("Regisnaldo", 1, "irritado", 0, "FACAM SILENCIO");

        Professor[] professores = {prof_1, prof_2, prof_3};

        for (Professor professor : professores) {
            professor.getAtributos();
            professor.ensinar();
            professor.tomarCafe();
            professor.getAtributos();
            System.out.println("\n");
        }

        for (Aluno aluno : alunos) {
            aluno.getAtributos();
            if(aluno.dormirNaAula()){
                System.out.println("esta dormindo");
            }
            if(aluno.fingir_estudar()){
                System.out.println("esta fingindo estudar");
            }
        }
    }
}
