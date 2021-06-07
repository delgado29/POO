public class Banco {
    private String nombre;
    private double tasaInteres;
    private double dinero;

    public Banco(String nombre, double tasaInteres, double dinero){
        this.nombre=nombre;
        this.tasaInteres=tasaInteres;
        this.dinero=dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void imprimirDineroDisponible(){

    }
}
