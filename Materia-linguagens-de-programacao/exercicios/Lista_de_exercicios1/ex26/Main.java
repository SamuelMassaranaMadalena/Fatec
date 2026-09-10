package exercicios.Lista_de_exercicios1.ex26;

public class Main {
    public static void main(String[] args){
        String[] alunos= {"Ana","Carlos","Mariana","João","Pedro"};
        double[] notas= {8.5,5.0,9.0,3.5,7.0};
        String estado = "";
        double maior = 0;
        double menor = 10;
        double media = 0;
        System.err.println("===== RELATORIO =====");
        for (int i =0; i<alunos.length;i++) {
            media +=notas[i];
            if(notas[i]<4){
                estado="reprovado";
            }else if(notas[i]<7){
                estado="recuperacao";
            }else{
                estado="aprovado";
            }

            if(notas[i]>maior){
                maior=notas[i];
            }
            if(notas[i]<menor){
                menor=notas[i];
            }
            
            System.err.printf("%s -> %s%n", alunos[i], estado);
        }
        System.err.printf("%nMedia da turma: %.2f%nMaior nota: %.2f%nMenor nota: %.2f",media/alunos.length,maior,menor);
    }
}
