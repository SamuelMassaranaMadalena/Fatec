package exercicios.Lista_de_exercicios1.ex25;

public class Main {
    public static void main(String[] args){
        String[] alunos= {"Ana","Carlos","Mariana","João","Pedro"};
        double[] notas= {8.5,5.0,9.0,3.5,7.0};
        String estado = "";
        
        for (int i =0; i<alunos.length;i++) {
            if(notas[i]<4){
                estado="reprovado";
            }else if(notas[i]<7){
                estado="recuperacao";
            }else{
                estado="aprovado";
            }
            
            System.err.printf("%s -> %s%n", alunos[i], estado);
        }
    }
}
