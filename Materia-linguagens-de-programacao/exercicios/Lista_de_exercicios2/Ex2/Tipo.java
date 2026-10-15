package exercicios.Lista_de_exercicios2.Ex2;

public class Tipo {
    static String  estiloUm = "Guerreiro";
    static String estiloDois = "Arqueiro";
    static String estiloTres = "Clerico";
    static String racaUm = "Humano";
    static String racaDois = "Elfo";
    static String racaTres = "Anao";
    String raca;
    String estilo;

    public Tipo (String raca, String estilo){
        setRaca(raca);
        setEstilo(estilo);
    }
    
    public void setRaca(String raca) {
        if(raca == racaUm || raca == racaDois || raca == racaTres){
            this.raca = raca;
        }
    }
    public String getRaca() {
        return raca;
    }
    public void setEstilo(String estilo) {
        if(estilo == estiloUm || estilo == estiloDois || estilo == estiloTres){
            this.estilo = estilo;
        }
    }
    public String getEstilo() {
        return estilo;
    }
}
