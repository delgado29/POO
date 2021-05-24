public class Celular extends Dispositivo  {
    protected double saldo;

    public Celular(String name, int ram, String procesador, double saldo) {
        super(name, ram, procesador);
        this.saldo=saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = this.saldo- saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sendMessage(){
        System.out.println("Mensaje enviado");
    }
}
