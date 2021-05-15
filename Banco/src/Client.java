public class Client extends User{

    private double saldo;
    public Client(String user, double password, String name, String lastname, double saldo) {
        super(user, password, name, lastname);
        this.saldo=saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void cargarSaldo(double saldo){
        this.saldo=this.saldo+saldo;
    }

    @Override
    public boolean iniciarSesion(String user, double password) {
        return false;
    }

    @Override
    public double cobrarCheque() {
        System.out.println("No trabajas aqui");
        return super.cobrarCheque();
    }
}
