package exercicios.Lista_de_exercicios1.ex24;

public class Main {
    public static void main(String[] args){
        String[] produtos = { "Mouse", "Teclado", "Monitor", "Notebook", "Impressora" };
        int[] estoque = { 10, 3, 0, 5, 2 };
        for(int i = 0; i<produtos.length;i++){
            if(estoque[i] == 0){
                System.err.printf("%s -> SEM ESTOQUE%n",produtos[i],estoque[i]);
            }else{
                System.err.printf("%s -> %d unidades%n",produtos[i],estoque[i]);
            }
            
        }
    }
}
