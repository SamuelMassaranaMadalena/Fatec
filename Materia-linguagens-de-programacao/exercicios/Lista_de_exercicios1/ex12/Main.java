package exercicios.Lista_de_exercicios1.ex12;

public class Main {
    public static void main(String[] args){
        int num_posi = 0;
        int[] numeros = { 5, -2, 10, -8,3, 0, 7 };
        for(int num:numeros){
            if(num>0){
                num_posi +=1;
            }
        }   
        System.err.println(num_posi + " numeros sao positivos");
    }
}
