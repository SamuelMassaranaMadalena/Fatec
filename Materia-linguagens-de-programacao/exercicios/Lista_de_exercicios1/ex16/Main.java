package exercicios.Lista_de_exercicios1.ex16;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,-2,0,-4,5,6,7,-8,-9,0};
        int[] pnz = {0,0,0};
        for(int num:nums){
            if(num>0){
                pnz[0]+=1;
            }
            if(num<0){
                pnz[1]+=1;
            }
            if(num==0){
                pnz[2]+=1;
            }
        }
        System.err.printf("%d positivos %n%d negativos%n%d zeros",pnz[0],pnz[1],pnz[2]);
    }
}
