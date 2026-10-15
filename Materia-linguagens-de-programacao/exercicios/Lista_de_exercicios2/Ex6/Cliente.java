package exercicios.Lista_de_exercicios2.Ex6;

public class Cliente {
    String nome;
    Endereco[] enderecos;
    Telefone[] telefones;
    Email[] emails;

    public Cliente(String nome, Endereco[] enderecos, Telefone[] telefones, Email[] emails){
        setNome(nome);
        setEmails(emails);
        setEnderecos(enderecos);
        setTelefones(telefones);
    }
    public void setEmails(Email[] emails) {
        this.emails = emails;
    }
    public Email[] getEmails() {
        return emails;
    }
    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }
    public Endereco[] getEnderecos() {
        return enderecos;
    }
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    public Telefone[] getTelefones() {
        return telefones;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public static void main(String[] args){
        Telefone tel1 = new Telefone("(15) xxxxx-xxxx");
        Telefone tel2 = new Telefone("(18) xxxxx-xxxx");

        Email emai1 = new Email("blaldsduasa8@gmail.com");
        Email emai2 = new Email("sudhaiysdgt7asgd@gmail.com");

        Endereco endereco1 = new Endereco("Rua caxula de marula", 101, null);
        Endereco endereco2 = new Endereco("Avenida lambreta ralada", 1821, "Andar 27, escitorio 17");

        Cliente joca = new Cliente("Joca", new Endereco[] {endereco1, endereco2}, new Telefone[]{tel1,tel2}, new Email[]{emai1, emai2});
        Cliente[] clientes = {joca};
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nome);
            for (Endereco endereco : cliente.enderecos) {
                if(endereco.complemento == null){
                    System.out.println(endereco.rua +", " +endereco.num);
                }else{
                    System.out.println(endereco.rua +", " +endereco.num+" - "+endereco.complemento);
                }
            }
            for (Email email : cliente.emails) {
                System.out.println(email.email);
            }
            for (Telefone telefone : cliente.telefones) {
                System.out.println(telefone.digitos);
            }
        }
    }
}
