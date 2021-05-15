package Animales;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Cuantos, registros quieres?");
        int r= scanner.nextInt();
        ;
        for (int x=0; x<r; x++ ){
            System.out.println("Inserta nombre:");
            String n= scanner.next();


        }

        Perro[] arrayPerro=new Perro[2];
        Perro pluto=new Perro(Color.YELLOW, 30, "Galgo");
        /*
        pluto.ladrar();
        pluto.comer();
        pluto.moverse();*/

        arrayPerro[0]=pluto;
        arrayPerro[1]=new Perro(Color.GRAY, 25, "Pitbull");

        System.out.println( arrayPerro[0].getRaza() );
    }



}