package exercicios.aula6_2;

public class Main {
    public static void main(String[] args){
        int[][] numeros =   {
                                {1,3,6},
                                {2,6,14,30,62}
                            };
        for(int[] linha: numeros){
            for(int num: linha){
                System.out.println(num);
            }
        }
    }
}
