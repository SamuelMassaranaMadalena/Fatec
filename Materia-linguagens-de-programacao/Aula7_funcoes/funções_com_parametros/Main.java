package Aula7_funcoes.funções_com_parametros;

public class Main {
    public static void main(String[] args){
        meuMetodo(1, 12, 23);
        saudacao("Samuel", "Massarana Madalena");
    }

    static void saudacao(String nome, String sobrenome){
        System.out.printf("Nome completo: %s %s", nome, sobrenome);
    }
    
    static void meuMetodo(int a, int b, int c){
        System.out.println(a + b);
        System.out.println(a + c);
        System.out.println(c + b);
    }
}
