package exercicios.aula7_exercicios.aula7_4;

public class Main {
    public static void main(String[] args) {
        escopo(1, 100);
    }   
    static void escopo(int n1, int n2){
        for(int i=0; i<n2;i++){
            System.out.print(n1+i +", " );
        }
    }
}
