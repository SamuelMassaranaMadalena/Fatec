// package Aula8_POO.aula8_exemplo1;

public class Main {
    //exemplifacao do professor \/
    // int x=5;
    // int y=2;

    public static void main(String[] args){
        //exemplificacao do professor \/
        // Main myObj = new Main();
        // Main myObj2 = new Main();
        // System.out.println(myObj.x);
        // System.out.println(myObj2.y);
        // myObj.x = 10;
        // myObj2.y = 50;
        // System.out.println(myObj.x);
        // System.out.println(myObj2.y);
        // System.out.println(myObj2.x);

        //exemplo final \/
        Personagem persona = new Personagem();
        persona.nome = "Pateta";
        persona.idade = 42; 
        persona.poder = 4.2;
        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
    }
}
