package exercicios.aula7_exercicios.aula7_2;

public class Main {
    public static void main(String[] args){
        System.out.println(decideEstado("alunito",6.999999999999999));
    }
    static String decideEstado(String nome, double nota){
        if(nota >= 7){
            return nome + " aprovado";
        }else{
            return nome + " reprovado";
        }
    }
}
