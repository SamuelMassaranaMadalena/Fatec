package exercicios.Lista_de_exercicios2.Ex4;

public class Motor {
    String nome;

    public Motor(String nome){
        setNome(nome);
    } 
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String roncoDoMotor(){
        return "RUMMMMMMMMM";
    }
}
