package exercicios.Lista_de_exercicios2.Ex1;

public class Professor {
    String nome;
    int quantidadeCafe;
    String humor;
    int nivelDePaciencia;
    boolean usaDatashow;
    String fraseFavorita;
    
    
    public Professor(String nome, int quantidadeCafe, String humor, int nivelDePaciencia, String fraseFavorita){
        setNome(nome);
        setCafe(quantidadeCafe);
        setHumor(humor);
        setPaciencia(nivelDePaciencia);
        setFrase(fraseFavorita);
    }

    public void getAtributos(){
        System.out.printf("atributos prof. %s: cafes-%d; humor-%s; paciencia-%d; usando datashow-%b; frase predileta-%s;\n", this.nome, this.quantidadeCafe, this.humor, this.nivelDePaciencia, this.usaDatashow, this.fraseFavorita);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCafe(int cafe){
        this.quantidadeCafe = cafe;
    }
    public void setHumor(String humor){
        this.humor = humor;
    }
    public void setPaciencia(int paciencia){
        this.nivelDePaciencia = paciencia;
    }
    public void setFrase(String Frase){
        this.fraseFavorita= Frase;
    }

    public void ensinar(){
        if(this.nivelDePaciencia<=1){
            System.out.println("VÃO PRA COORDENAÇÂO!!!");
        }else{
            if(this.humor == "irritado"){
                System.out.println("copiem do quadro!");
                this.usaDatashow = false;
            }else{
                System.out.printf("Blah blah blah %s blah blah lição\n", this.fraseFavorita);
                this.usaDatashow = true;
            }
        }
    } //⇒ professor finge ensinar
    public void tomarCafe(){
        System.out.println("Professor toma café!");
        this.quantidadeCafe += 1;
    }// ⇒ professor toma café
}
