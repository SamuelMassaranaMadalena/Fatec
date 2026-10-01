package Aula9_classes_e_objs.aula9_ex2;

public class Veiculos {
  int ano;
  String modelo;

  // Constructor com um parâmetro
  public Veiculos(String modelo) {
    // Call the two-parameter constructor to reuse code and set a default year    
    // 2020 Corvette
    this(2020, modelo);
  }

  // Constructor with two parameters
  public Veiculos(int ano, String modelo) {
    // Use 'this' to assign values to the class variables
    this.ano = ano;
    this.modelo = modelo;
  }

  // Method to print car information
  public void printInfo() {
    System.out.println(ano + " " + modelo);
  }

  public static void main(String[] args) {
    // Create a car with only model name (uses default year)
    Veiculos car1 = new Veiculos("Corvette");

    // Create a car with both model year and name
    Veiculos car2 = new Veiculos(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}
