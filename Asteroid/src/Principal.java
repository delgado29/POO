import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        /*
        Asteroide c = new Asteroide("Ceres1", "Hielo", 400000000, 17882);
        Asteroide e = new Asteroide("Euphrosyne31", "Helio", 472000000, 16.6);
        Asteroide v = new Asteroide("Vesta4", "Hierro", 542050000, 0.35);

        System.out.println( c.getName());
        c.setName("CERES 1");
        System.out.println( c.getName());
        System.out.println( c.getComposition());
        System.out.println( c.speed);
        System.out.println( c.distance_of_earth);
        System.out.println("");

        System.out.println( e.getName());
        e.setName("EUPHROSYNE 31");
        System.out.println( e.getName());
        System.out.println( e.getComposition());
        System.out.println( e.speed);
        System.out.println( e.distance_of_earth);
        System.out.println("");

        System.out.println( v.getName());
        v.setName("VESTA 4");
        System.out.println( v.getName());
        System.out.println( v.getComposition());
        System.out.println( v.speed);
         System.out.println( v.distance_of_earth);
        */

        int op = 0;
        Scanner scanner = new Scanner(System.in);
        while (op != 3) {
            System.out.println("¿Que quieres hacer? \n 1)Crear estrella \n 2)Crear asteroide \n 3)Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Introduzca el diametro(km):");
                    double d = scanner.nextDouble();
                    System.out.println("Elija el tipo de estrella: \n 1)Enana roja \n 2)Supernova \n 3)Gigante roja");
                    int t = scanner.nextInt();
                    String tipo = "";
                    if (t == 1) {
                        tipo = "Enana roja";
                    } else if (t == 2) {
                        tipo = "Supernova";
                    } else if (t == 3) {
                        tipo = "Gigante roja";
                    } else {
                        tipo = "Estrella normal";
                    }
                    System.out.println("Elija el color de la estrella: \n 1)Rojo \n 2)Azul");
                    int c=scanner.nextInt();
                    Color color=Color.BLACK;

                    if (c==1){
                        color=Color.RED;
                    }else
                        if (c==2){
                            color=Color.BLUE;
                        }else
                        {
                            color=Color.WHITE;
                        }
                        Star Estrella1=new Star(d, tipo, color);
                    System.out.println("La estrella que creaste es:\n Diametro:"+Estrella1.getDiameter()
                            +"\n De tipo:"+Estrella1.getType()+"\n Color:"+Estrella1.getColor());
                    break;
                }
                case 2: {
                    System.out.println("Introduzca el nombre de el asteroide que desea crear:");
                    String n=scanner.next();
                    System.out.println("Indique la composicion del asteroide que deasea crear: \n 1)Carbono \n 2)Silicio");
                    int c=scanner.nextInt();
                    String composition="";
                    if (c==1){
                        composition="Carbono";
                    }else
                        if (c==2){
                            composition="Silicio";
                        }else{
                            composition="Mezcla de metales";
                        }
                    System.out.println("Introduzca la distancia a la tierra desde este asteroide(km):");
                    double d= scanner.nextDouble();

                    System.out.println("Introduzca la velocidad del asteroide(km/h):");
                    double v= scanner.nextDouble();
                    Asteroide Asteroide1=new Asteroide(n, composition, d, v);
                    System.out.println("El asteroide que creaste es: \n Nombre:"+Asteroide1.getName()+"\n Composicion:"
                            +Asteroide1.getComposition()+"\n Distancia a la tierra:"+Asteroide1.distance_of_earth
                            +"\n Velocidad:"+Asteroide1.speed);
                    break;
                }
                case 3: {
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                }
            }
        }

    }
    }


