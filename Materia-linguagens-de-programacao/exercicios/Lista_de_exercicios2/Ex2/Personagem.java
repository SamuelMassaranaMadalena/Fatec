package exercicios.Lista_de_exercicios2.Ex2;

public class Personagem {
    String nome;
    int vida;
    Tipo tipo;
    Poder poder;
    // String tipo;
    // String raca;
    public Personagem(String nome, int vida, Tipo tipo, Poder poder){
        setNome(nome);
        setVida(vida);
        setTipo(tipo);
        setPoder(poder);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Poder getPoder() {
        return poder;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setPoder(Poder poder) {
        this.poder = poder;
    }
    public int getVida() {
        return vida;
    }
    public static void main(String[] args) {
        Tipo tipo1 = new Tipo("Anao", "Guerreiro");
        Poder poder1 = new Poder("Furia rebaixada", "quando irritado, uma simples rasteira derruba qualquer oponente");
        Tipo tipo2 = new Tipo("Elfo", "Clerico");
        Poder poder2 = new Poder("Guardião eterno", "qualquer golpe fatal desferido no primeiro ataque ou de forma furtiva, é negado parciamente, deixando a vitima ter tempo de reacao");
        Tipo tipo3 = new Tipo("Humano", "Arqueiro");
        Poder poder3 = new Poder("Miopia", "Chance de errar tiros é aumentada em 55%");
        
        
        Personagem prota = new Personagem("Roneu", 202, tipo1, poder1);
        Personagem auxiliar = new Personagem("Gisceia", 75, tipo2, poder2);
        Personagem segundario = new Personagem("bigrets", 120, tipo3, poder3);

        Personagem[] grupoPrincipal = {prota, auxiliar, segundario};

        for (Personagem personagem : grupoPrincipal) {
            System.out.println(personagem.nome);
            System.out.println(personagem.vida);
            System.out.println(personagem.tipo.estilo);
            System.out.println(personagem.tipo.raca);
            System.out.println(personagem.poder.nome);
            System.out.println(personagem.poder.descrevendo + "\n");
        }

    }
}
