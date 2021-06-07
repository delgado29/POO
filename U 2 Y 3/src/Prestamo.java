public class Prestamo extends Banco {
    private double fechaPrestamo;
    private double montoPrestamo;
    private double abono;
    private String firma;

    public Prestamo(String nombre, double tasaInteres, double dinero, double fechaPrestamo, double montoPrestamo, double abono, String firma){
        super(nombre, tasaInteres, dinero);
        this.fechaPrestamo=fechaPrestamo;
        this.montoPrestamo=montoPrestamo;
        this.abono=abono;
        this.firma=firma;
    }

    public void setFechaPrestamo(double fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public double getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getAbono() {
        return abono;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void imprimirPagoconTasa(){
        System.out.println(" Cantidad restante por pagar:\n $ "+(getMontoPrestamo()+(getMontoPrestamo()*(getTasaInteres()/100))));
    }
    public void imprimirDineroDisponible(){
        System.out.println(" El dinero disponible es:\n $ "+(getMontoPrestamo()+(getMontoPrestamo()*(getTasaInteres()/100))));
    }
    public void imprimirContrato(){
        System.out.println(" Banco: "+getNombre()+"\n Fecha: "+getFechaPrestamo()+"\n Tasa de interes: "+getTasaInteres()+"% \n Abono: "+getAbono()+"\n Monto del prestamo: "+getMontoPrestamo());
        imprimirPagoconTasa();
        imprimirDineroDisponible();
        System.out.println(" Firma: "+getFirma());
    }
}