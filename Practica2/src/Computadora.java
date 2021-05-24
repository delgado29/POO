public class Computadora extends Dispositivo{
    public String teclado;
    public Computadora(String name, int ram, String procesador, String teclado){
        super(name, ram, procesador);
        this.teclado=teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getTeclado() {
        return teclado;
    }
    public void encederWebCam(){
        System.out.println("Web cam encendida");
    }
}
