import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        int horas = edad * 8760;
        if (edad <= 0) {
            System.out.println("Aun no naces XD");
        } else if (edad <= 12) {
            System.out.println("Aun eres un niño y has vivido: " + horas + " horas.");
        } else if (edad > 12) {
            if (edad < 18) {
                System.out.println("Eres joven y haz vivido: " + horas + " horas.");
            } else if (edad >= 18) {
                System.out.println("Eres mayor de edad y has vivido: " + horas + " horas.");
            }
        }

        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.println("Introdusca la tabla de multiplicar que desea ver: ");
        int tabla = scanner.nextInt();
        if (tabla == 1) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 1 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 2) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 2 * a;
                System.out.println("1x" + a + "=" + b);
            }

        } else if (tabla == 3) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 3 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 4) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 4 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 5) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 5 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 6) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 6 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 7) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 7 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 8) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 8 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 9) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 9 * a;
                System.out.println("1x" + a + "=" + b);
            }
        } else if (tabla == 10) {
            for (int a = 1; a <= 10; a = a + 1) {
                int b = 10 * a;
                System.out.println("1x" + a + "=" + b);
            }
        }
    }
}



