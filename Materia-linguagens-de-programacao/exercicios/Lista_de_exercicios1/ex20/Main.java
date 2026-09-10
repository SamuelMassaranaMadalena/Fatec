package exercicios.Lista_de_exercicios1.ex20;

public class Main {
    public static void main(String[] args){
        double[] notas = { 7.5, 4.0, 8.5, 5.5, 9.0, 3.5 };
        for (double nota : notas) {
            if(nota<4){
                System.err.println(nota + "-> reprovado");
            }else if(nota<7){
                System.err.println(nota + "-> recuperacao");
            }else{
                System.err.println(nota + "-> aprovado");
            }
        }
    }
}
