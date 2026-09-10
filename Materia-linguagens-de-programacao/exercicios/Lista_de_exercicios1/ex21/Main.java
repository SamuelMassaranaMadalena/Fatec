package exercicios.Lista_de_exercicios1.ex21;

public class Main {
    public static void main(String[] args){
        double[] salarios = {
            1800,
            2500,
            3200,
            4500,
            7000
        };
        for(double salario: salarios){
            System.err.println(salario*0.1+salario);
        }
    }
}
