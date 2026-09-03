package exercicios.aula4_3for;

public class Main {
    public static void main(String[] args){
        // for(int i=100;i!=0;i--){
        //     System.out.println(i);
        // }
        
        // for(int x =0;x<8; x++){
        //     for(int y = 0; y<8; y++){
        //         if (x%2==0 && y%2==1){
        //             System.out.print("0");
        //         }else if(x%2==1 && y%2==0){
        //             System.out.print("0");
        //         }else if(x%2==1 && y%2==1){
        //             System.out.print("1");
        //         }else if(x%2==0 && y%2==0){
        //             System.out.print("1");
        //         }

        //     }
        //     System.out.println("");
        // }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        String[] alunos = {"A1", "A2", "A3"};

        for(String estudante:alunos){
            System.out.println(estudante);
        }
    }   
}
