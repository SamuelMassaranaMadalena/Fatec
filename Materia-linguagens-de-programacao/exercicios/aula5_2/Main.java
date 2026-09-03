package exercicios.aula5_2;

public class Main {
    public static void main(String[] args){
        double[] numeros = {1,3,0,-38192,0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001};

        // for(double numero : numeros){
        //     if(numero>0){
        //         System.out.println("é positivo");
        //     }
        //     if(numero==0){
        //         System.out.println("é zero");
        //     }
        //     if(numero<0){
        //         System.out.println("é negativo");
        //     }
        // }

        for(int i=0;i < numeros.length;i++){
            if(numeros[i]==0){
                System.out.println("é positivo");
            }
            if(numeros[i]==0){
                System.out.println("é zero");
            }
            if(numeros[i]<0){
                System.out.println("é negativo");
            }
        }
    }
}
