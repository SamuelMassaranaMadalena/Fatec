package exercicios.Lista_de_exercicios1.ex3;

public class Main {
    public static void main(String[] args){
        double nota = 3.9;
        if(nota<4){
            System.err.println("Reprovado");
        }else if(nota<6){
            System.err.println("Recuperacao");
        }else{
            System.err.println("aprovado");
        }
    }
}
