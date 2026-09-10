package exercicios.Lista_de_exercicios1.ex22;

public class Main {
    public static void main(String[] args){
        int[] numeros= { 15, 8, 32, 4, 19, 27, 11 };
        int maior = 0;
        int menor = 100;
        for(int num:numeros){
            if(num>maior){
                maior = num;
            }
            if(num<menor){
                menor = num;
            }
        }
        System.err.println("Maior: "+maior);
        System.err.println("Menor: "+menor);
    }
}
