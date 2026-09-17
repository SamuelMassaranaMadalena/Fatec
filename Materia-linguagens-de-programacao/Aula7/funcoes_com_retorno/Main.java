package Aula7.funcoes_com_retorno;

public class Main {
    public static void main(String[] args){
        if(ligarInterruptor()==true){
            System.out.println("Processo funcionou");
        }else{
            System.out.println("Processo falhou");
        }
        // System.out.println(ligarInterruptor());
    }
    static boolean acenderLampada(){
        return true;
    }
    static boolean passarEletricidade(){
        return true;
    }
    static boolean ligarInterruptor(){
        if(passarEletricidade()){
            if(acenderLampada()){
                System.out.println("Lampada acendeu");
                return true;
            }else{
                System.out.println("Lampada queimou");
                return false;
            }
        }else{
            System.out.println("Problema no circuito");
            return false;
        }
    }

}
