package exercicios.aula9_exercicios.E1;

public class Fatec {
    public static void main(String[] args){
        Alunos aluno1 = new Alunos("Japa", "japinhaduGrau@gmail.com"); 
        Alunos aluno2 = new Alunos("Lyncon", "orbisdotcom@gmail.com"); 
        Alunos aluno3 = new Alunos("Vinicius", "Vini7@gmail.com"); 
        Alunos aluno4 = new Alunos("Patrick", "aprendizDeHerdeiro@gmail.com"); 
        Alunos[] chamada = {aluno1,aluno2,aluno3, aluno4};
        for (Alunos aluno : chamada) {
            System.out.println("Nome: "+aluno.nome + " Email: " + aluno.email);
        }
    }
}
