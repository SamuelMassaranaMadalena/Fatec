package exercicios.aula5_1;

public class Main {
    public static void main(String[] args){
        String[] produtos = {"P1","P2","P3","P4","P5"};
        
        System.out.println("ForEach");
        for(String produto : produtos){
            System.out.println(produto);
        }
        System.out.println("\nFor");
        for(int i=0;i!=5;i++){
            // String produta = produtos[i];
            // System.out.println(produta); 
            System.out.println(produtos[i]); 

        }

    }
}
