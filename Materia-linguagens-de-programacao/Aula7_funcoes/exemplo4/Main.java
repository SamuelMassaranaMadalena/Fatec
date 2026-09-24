package Aula7_funcoes.exemplo4;

public class Main {
    public static void main(String[] args){
        contador(40);
    }
    static void contador(int n){
        if(n>0){
            System.out.println(n + " ");
            contador(n-1);
        }
    }
}
