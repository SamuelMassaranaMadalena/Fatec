package exercicios.aula7_exercicios.Aula7_1;

public class Main {
    public static void main(String[] args){
       oQueEh(-2129);
    }

    static void oQueEh(int x){
        if(x>0){
            System.out.println("Maior que zero");
        }
        if(x==0){
            System.out.println("é zero");
        }
        if(x<0){
            System.out.println("menor que zero");
        }
    }
}
