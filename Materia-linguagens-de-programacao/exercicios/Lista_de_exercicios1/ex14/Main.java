package exercicios.Lista_de_exercicios1.ex14;

public class Main {
    public static void main(String[] args){
        int[] numeros = {15,8,32,4,19,27};
        int bignum = 0;
        for(int num:numeros){
            if(num>bignum){
                bignum=num;
            }
        }
        System.err.println(bignum);
    }
}
