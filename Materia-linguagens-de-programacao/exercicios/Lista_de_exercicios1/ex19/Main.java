package exercicios.Lista_de_exercicios1.ex19;

public class Main {
    public static void main(String[] args){
        double[] precos = {
            10.50,
            25.90,
            100.00,
            45.50,
            8.90
        };
        for (double preco : precos) {
            if(preco>30){
                System.err.println(preco);
            }
        }
    }
}
