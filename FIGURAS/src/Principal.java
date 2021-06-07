import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Cuadrado c= new Cuadrado(Color.BLACK, 10,10);
        System.out.println(c.calcularArea());
        Circulo ci=new Circulo(Color.GRAY, 10);
        System.out.println(ci.calcularArea());
    }
}
