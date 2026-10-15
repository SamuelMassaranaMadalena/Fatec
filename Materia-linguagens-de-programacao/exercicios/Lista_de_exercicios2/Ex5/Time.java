package exercicios.Lista_de_exercicios2.Ex5;

public class Time {
    String nome;
    Jogador[] jogadores;
    EquipeTecnica equipeTecnica;

    public Time(String nome, Jogador[] jogadores, EquipeTecnica equipeTecnica){
        setJogadores(jogadores);
        setEquipeTecnica(equipeTecnica);
        setNome(nome);
    }
    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }
    public EquipeTecnica getEquipeTecnica() {
        return equipeTecnica;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Joque", 1);
        Jogador jogador2 = new Jogador("Jumba", 4);
        Jogador jogador3 = new Jogador("trunca", 7);
        Jogador jogador4 = new Jogador("kurantra", 11);
        Jogador jogador5 = new Jogador("miririm", 22);
        Jogador jogador6 = new Jogador("Rampila", 9);
        Jogador jogador7 = new Jogador("Lonni", 10);

        Jogador jogadorGenerico = new Jogador("generico", 99);

        Membro membro1 = new Membro("muricilo", "analisador");
        Membro membro2 = new Membro("venacir", "analisador");
        Membro membro3 = new Membro("marunco", "multimidia");
        Membro membro4 = new Membro("niranto", "mediador");
        Tecnico tecnico = new Tecnico("joacir");
        
        Membro membroG = new Membro("Generator", "ocupar espaco");
        Tecnico tecnicoG = new Tecnico("Genarica");
        EquipeTecnica equipeTecnicaG = new EquipeTecnica(new Membro[] {membroG, membroG, membroG, membroG}, tecnicoG);


        EquipeTecnica equipeTecnica = new EquipeTecnica(new Membro[] {membro1, membro2, membro3, membro4}, tecnico);
        Time corinthians_alagoano = new Time("Corinthians Alagoano", new Jogador[] {jogador1, jogador2, jogador3, jogador4, jogador5, jogador6, jogador7}, equipeTecnica);

        Time timeGenerico = new Time("Genericos", new Jogador[]{jogadorGenerico,jogadorGenerico,jogadorGenerico,jogadorGenerico,jogadorGenerico,jogadorGenerico,jogadorGenerico}, equipeTecnicaG);

        Time[] disputa = {corinthians_alagoano, timeGenerico};

        for (Time time : disputa) {
            System.out.println(time.nome);
            System.out.println("Jogadores:");
            for (Jogador jogador : time.jogadores) {
                System.out.println(jogador.nome);
            }
            System.out.println("Equipe Tecnica:");
            for (Membro membro : time.equipeTecnica.membros) {
                System.out.println(membro.nome);
            }
            System.out.println(time.equipeTecnica.tecnico.nome);
            System.out.println();
        }
    }
}
