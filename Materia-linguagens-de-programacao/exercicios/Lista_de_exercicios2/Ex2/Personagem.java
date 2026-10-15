package exercicios.Lista_de_exercicios2.Ex2;

public class Personagem {
    String nome;
    int vida;
    Tipo[] tipo;
    Poder poder;
    // String tipo;
    // String raca;
    public Personagem(String nome, int vida, Tipo[] tipo, Poder poder){
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
    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }
    public Tipo[] getTipo() {
        return tipo;
    }
    public void setPoder(Poder poder) {
        this.poder = poder;
    }
    public int getVida() {
        return vida;
    }
    public static void main(String[] args) {
        Tipo tipo1 = new Tipo("Anao");
        Tipo tipo2 = new Tipo("Elfo");
        Tipo tipo3 = new Tipo("Guerreiro");
        Tipo tipo4 = new Tipo("Clerico");
        Tipo tipo5 = new Tipo("Humano");
        Tipo tipo6 = new Tipo("Arqueiro");
        Poder poder1 = new Poder("Furia rebaixada", "quando irritado, uma simples rasteira derruba qualquer oponente");
        Poder poder2 = new Poder("Guardião eterno", "qualquer golpe fatal desferido no primeiro ataque ou de forma furtiva, é negado parciamente, deixando a vitima ter tempo de reacao");
        Poder poder3 = new Poder("Miopia", "Chance de errar tiros é aumentada em 55%");
        
        
        Personagem prota = new Personagem("Roneu", 202, new Tipo[] {tipo1, tipo3}, poder1);
        Personagem auxiliar = new Personagem("Gisceia", 75, new Tipo[]{tipo2,tipo4}, poder2);
        Personagem segundario = new Personagem("bigrets", 120, new Tipo[]{tipo5, tipo6}, poder3);

        Personagem[] grupoPrincipal = {prota, auxiliar, segundario};

        for (Personagem personagem : grupoPrincipal) {
            System.out.println(personagem.nome);
            System.out.println(personagem.vida);
            for (Tipo tipos : personagem.tipo) {
                System.out.println(tipos.tipo);
            }
            System.out.println(personagem.poder.nome);
            System.out.println(personagem.poder.descrevendo + "\n");
        }

    }
}
