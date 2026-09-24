// package Aula8_POO.aula8_exemplo2;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
        Balao balao1 = new Balao();
        Helicoptero helicoptero1 = new Helicoptero();

        carro1.marca = "Hyundai";
        carro1.modelo = "HB20";
        carro1.combustivel = "diesel";
        carro1.cor = "azul";
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.combustivel);
        System.out.println(carro1.cor);
        carro1.ligarMotor();
        carro1.desligarMotor();
        System.out.println();
        
        moto1.marca = "honda";
        moto1.modelo = "pop100";
        moto1.combustivel = "gasolina";
        moto1.cilindradas = "200cc";
        System.out.println(moto1.marca);
        System.out.println(moto1.combustivel);
        System.out.println(moto1.modelo);
        System.out.println(moto1.cilindradas);
        moto1.ligarMotor();
        moto1.desligarMotor();
        System.out.println();
        
        balao1.limites_pessoas = "6";
        System.out.println(balao1.limites_pessoas);
        balao1.acender();
        balao1.subir();
        balao1.descer();
        System.out.println();

        helicoptero1.marca = "Sikorsky";
        helicoptero1.modelo = "S-92";
        helicoptero1.ano = "2001";
        System.out.println(helicoptero1.marca);
        System.out.println(helicoptero1.modelo);
        System.out.println(helicoptero1.ano);
        helicoptero1.ligarMotor();
        helicoptero1.desligarMotor();
    }
}
