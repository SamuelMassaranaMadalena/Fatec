package exercicios.Lista_de_exercicios1.ex4;

public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c = 3;

        if(a>b &a>c){
            System.err.println("A eh maior");
        }
        if(b>a &b>c){
            System.err.println("B eh maior");
        }
        if(c>b &c>a){
            System.err.println("C eh maior");
        }
        
    }
}
