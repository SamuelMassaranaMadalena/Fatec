package exercicios.Lista_de_exercicios1.ex23;

public class Main {
    public static void main(String[] args){
        double[] notas= { 7.5, 8.0, 4.5, 6.0, 9.0, 3.5, 5.0, 8.5, 10.0, 6.5 };
        double media = 0;
        double maior = 0;
        double menor = 10;
        int aprove = 0;
        int reprove = 0;
        for (double nota : notas) {
            media+=nota;
            if(nota>maior){
                maior=nota;
            }
            if(nota<menor){
                menor=nota;
            }
            if(nota>7){
                aprove+=1;
            }
            if(nota<4){
                reprove+=1;
            }
        }   
        System.err.printf("Media: %.2f%nMaior nota: %.2f%nMenor nota %.2f%nQuantidade de aprovados: %d%nQuantidade de reprovados: %d",media/notas.length,maior,menor,aprove,reprove);
    }
}
