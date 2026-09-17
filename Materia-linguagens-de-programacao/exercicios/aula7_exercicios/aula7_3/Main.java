package exercicios.aula7_exercicios.aula7_3;

public class Main {
    public static void main(String[] args){
        tabuada(7);
    }
    static void tabuada(int n){
        for(int i =0;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
