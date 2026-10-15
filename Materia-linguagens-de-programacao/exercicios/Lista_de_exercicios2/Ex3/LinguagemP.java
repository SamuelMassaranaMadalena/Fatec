package exercicios.Lista_de_exercicios2.Ex3;

public class LinguagemP {
    String nome;
    String tipo;

    public LinguagemP(String nome, String tipo){
        setNome(nome);
        setTipo(tipo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
