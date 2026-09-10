package exercicios.Lista_de_exercicios1.ex18;

public class Main {
    public static void main(String[] args){
        String[] nomes = {
            "Letsgo Daqui Silva",
            "César Teio",
            "Bispo de Paris",
            "Antônio Morrendo das Dores",
            "Rolando Escada Abaixo Santos",
            "Amazonas Rio do Brasil Pimpão",
            "Amin Amou Amado Pinto",
            "Amado Amoroso",
            "Inocêncio Coitadinho",
            "Maria Privada de Jesus",
            "Zélia Tocafundo Pinto"
        };

        for(String nome: nomes){
            if(nome == "Bispo de Paris"){
                System.err.println("Nome encontrado");
            }
        }
    }
}
