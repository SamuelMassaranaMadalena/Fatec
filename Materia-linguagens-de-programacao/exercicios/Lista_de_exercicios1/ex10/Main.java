package exercicios.Lista_de_exercicios1.ex10;

public class Main {
    public static void main(String[] args){
        int soma = 0;
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                soma+=i;
                System.err.println(soma);
            }
        }
    }
}
