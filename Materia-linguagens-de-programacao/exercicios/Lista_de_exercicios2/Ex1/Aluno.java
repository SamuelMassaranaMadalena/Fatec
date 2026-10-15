package exercicios.Lista_de_exercicios2.Ex1;

public class Aluno {
    String nome;
    String email;
    boolean inteligente;
    boolean estudioso;
    int nivel_sono; // 0 a 10
    boolean piscando_lento;
    public Aluno(String nome, String email, boolean intel, boolean estud, int nivel_sono, boolean piscando){
        setNome(nome);
        setEmail(email);
        setIntel(intel);
        setEstud(estud);
        setSono(nivel_sono);
        setPisca(piscando);

    }

    public void getAtributos(){
        System.out.printf("\natributos aluno %s: email-%s; inteligente-%b; estudioso-%b; nivel de sono-%d; piscando_lento-%b;\n ", this.nome, this.email, this.inteligente, this.estudioso, this.nivel_sono, this.piscando_lento);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setIntel(boolean intel){
        this.inteligente = intel;
    }
    public void setEstud(boolean estudios){
        this.estudioso = estudios;
    }
    public void setSono(int nome){
        this.nivel_sono = nome;
    }
    public int getNivel_sono() {
        return nivel_sono;
    }
    public void setPisca(boolean pisca){
        this.piscando_lento = pisca;
    }
    public String getNome(){
        return this.nome;
    }

    public boolean dormirNaAula(){
        if((this.piscando_lento == true) && (this.nivel_sono > 7) ){
            return true;
        }
        return false;
    }

    public boolean fingir_estudar(){
        if(this.estudioso != true && this.inteligente != true){
            return true;
        }
        return false;
    }
}
