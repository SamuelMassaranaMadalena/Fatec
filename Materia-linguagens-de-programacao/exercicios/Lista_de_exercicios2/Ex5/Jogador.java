package exercicios.Lista_de_exercicios2.Ex5;

public class Jogador {
    String nome;
    int numId;

    public Jogador(String nome, int numId){
        setNome(nome);
        setNumId(numId);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNumId(int numId) {
        this.numId = numId;
    }
    public int getNumId() {
        return numId;
    }
}
