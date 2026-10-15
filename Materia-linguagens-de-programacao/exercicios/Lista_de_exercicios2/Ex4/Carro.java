package exercicios.Lista_de_exercicios2.Ex4;

public class Carro {
    String modelo;    
    Motor motor;
    Acessorio[] acessorios;

    public Carro(String modelo, Motor motor, Acessorio[] acessorios){
        setAcessorios(acessorios);
        setModelo(modelo);
        setMotor(motor);
    }
    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }
    public Acessorio[] getAcessorios() {
        return acessorios;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Motor getMotor() {
        return motor;
    }
    public static void main(String[] args){
        Motor motor1 = new Motor("v8");
        Motor motor2 = new Motor("v10");
        Motor motor3 = new Motor("v9");
        Acessorio acessorio1 = new Acessorio("Nitro", "dar velocidade");
        Acessorio acessorio2 = new Acessorio("radio", "tocar musica");
        Acessorio acessorio3 = new Acessorio("dashcam", "filmar a frente e interior do carro");

        Carro carro1 = new Carro("Uno", motor2, new Acessorio[] {acessorio1, acessorio2, acessorio3});
        Carro carro2 = new Carro("fusca", motor1, new Acessorio[] {acessorio1, acessorio3});
        Carro carro3 = new Carro("mercedez", motor3, new Acessorio[] {acessorio2});
        Carro[] carros = {carro1, carro2, carro3};

        for (Carro carro : carros) {
            System.err.println(carro.modelo);
            System.err.println(carro.motor.nome);
            for (Acessorio acessorio : carro.acessorios) {
                System.err.println(acessorio.nome);
                System.err.println(acessorio.utilidade);
            }
            System.out.println();
        }
    }
}
