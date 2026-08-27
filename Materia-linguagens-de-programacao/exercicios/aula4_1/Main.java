package exercicios.aula4_1;

public class Main {
    public static void main(String[] args){
        Boolean luz = true;
        // if(luz){
        //     System.out.println("A luz está acesa");
        // }else{
        //     System.out.println("A luz está apagada");
        // }

        String ligada = (luz)? "A luz está acesa" : "A luz está apagada";
        System.out.println(ligada);
    
    
        int idade = 60;
        
        if(idade<12){
            System.out.println("crianca");
        }else if(idade<18){
            System.out.println("adolescente");
        }else if(idade<60){
            System.out.println("adulto");
        }else{
            System.out.println("idoso");
        }
    }
}
