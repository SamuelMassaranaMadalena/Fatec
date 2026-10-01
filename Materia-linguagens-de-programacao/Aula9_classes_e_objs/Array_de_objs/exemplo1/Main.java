package Aula9_classes_e_objs.Array_de_objs.exemplo1;

public class Main {
    public static void main(String[] args){
        Veiculo carro_1 = new Veiculo("Fiat", "Uno");
        Veiculo carro_2 = new Veiculo("BYD", "Compact 2026");
        Veiculo carro_3 = new Veiculo("Honda", "Civic");
        Veiculo carro_4 = new Veiculo("Gurgel", "Gurgel 1960");
        Veiculo[] estacionamento = {carro_1,carro_2,carro_3,carro_4};

        for (Veiculo veiculo : estacionamento) {
            System.out.println("Marca: "+veiculo.marca + "Modelo: "+ veiculo.modelo);
        }
    }
}
