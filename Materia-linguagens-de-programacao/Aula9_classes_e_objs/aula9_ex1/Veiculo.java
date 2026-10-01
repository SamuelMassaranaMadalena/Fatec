package Aula9_classes_e_objs.aula9_ex1;

public class Veiculo {
  int velocidade = 0;


//   public Veiculo (int nova_velocidade) { //método construtor
//     velocidade = nova_velocidade; 
//   }


  public Veiculo (int velocidade) { //método construtor
    this.velocidade = velocidade; 
  }

  public static void main(String[] args) {
    Veiculo carro = new Veiculo(100); //instância
    System.out.println(carro.velocidade); // 100
  }
}