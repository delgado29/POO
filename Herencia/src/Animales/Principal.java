package Animales;

import java.awt.*;

public class Principal {
    public static void main(String[] args) {

        Perro pluto=new Perro(Color.YELLOW, 30, "Galgo");

        pluto.ladrar();
        pluto.comer();
        pluto.moverse();
    }
}
