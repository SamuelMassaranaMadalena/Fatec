package exercicios.Lista_de_exercicios1.ex15;

public class Main {
    public static void main(String[] args){
        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5 };
        double media = 0;
        for(double nota:notas){
            media+=nota;
        }   
        System.err.println(media/notas.length);
    }
}
