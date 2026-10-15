package exercicios.Lista_de_exercicios2.Ex3;

public class Programador {
    LinguagemP[] linguagem;
    int nivel_cafeina;
    SO[] sistema_operacional;

    public Programador(LinguagemP[] linguagem, int nivel_cafeina, SO[] sistema_operacional){
        setLinguagem(linguagem);
        setNivel_cafeina(nivel_cafeina);
        setSistema_operacional(sistema_operacional);
    }
    public void setLinguagem(LinguagemP[] linguagem) {
        this.linguagem = linguagem;
    }
    public LinguagemP[] getLinguagem() {
        return linguagem;
    }
    public void setNivel_cafeina(int nivel_cafeina) {
        this.nivel_cafeina = nivel_cafeina;
    }
    public int getNivel_cafeina() {
        return nivel_cafeina;
    }
    public void setSistema_operacional(SO[] sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }
    public SO[] getSistema_operacional() {
        return sistema_operacional;
    }
    public static void main(String[] args){
        LinguagemP python = new LinguagemP("python", "backend");
        LinguagemP html = new LinguagemP("html", "frontend, e eh Linguagem de Marcacao!");
        LinguagemP php = new LinguagemP("php", "backend");
        LinguagemP java = new LinguagemP("java", "backend");
        SO macOS= new SO("macOS");
        SO linux = new SO("arch linux");
        SO windows = new SO("windows");

        Programador irineu = new Programador(new LinguagemP[] {python,html,php}, 12, new SO[]{macOS, linux});
        Programador muxucreu = new Programador(new LinguagemP[] {java,html,php}, 12, new SO[]{windows, linux});
        Programador[] bla = {irineu, muxucreu};

        for (Programador programador : bla) {
            for (LinguagemP lingua : programador.linguagem) {
                System.out.println(lingua.nome);
                System.out.println(lingua.tipo);
            }
            System.out.println(programador.nivel_cafeina);
            for (SO so : programador.sistema_operacional) {
                System.out.println(so.SO);
            }
            System.out.println();
        }

        
    }
}
