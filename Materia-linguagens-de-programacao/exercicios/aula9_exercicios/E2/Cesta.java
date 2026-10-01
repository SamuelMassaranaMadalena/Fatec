package exercicios.aula9_exercicios.E2;

public class Cesta {
    public static void main(String[] args){
        Itens produto1 = new Itens("7127812361239", "panetone", 1, 10.99);
        Itens produto2 = new Itens("7123812831378", "macarrao", 2, 2.99);
        Itens produto3 = new Itens("7121293823891", "molho de tomate", 4, 1.99);
        Itens produto4 = new Itens("7122839171862", "pacote quilo de feijao", 1, 8.99);
        Itens produto5 = new Itens("7126726137272", "pacote quilo de arroz", 2, 5.99);
        Itens[] lista = {produto1,produto2,produto3,produto4,produto5};

        for (Itens produto : lista) {
            System.out.printf("Codigo de barras: %s produto: %s quantidade: %d preco: %.2f\n",produto.codigo,produto.nome,produto.quantidade,produto.preco);
        }
    }
}
