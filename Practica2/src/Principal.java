import java.util.Scanner;

public class Principal  {
    public static void main(String[] args) {
        int op=0;
        Celular[] arrayCelular=new Celular[0];
        Computadora[] arrayComputadora=new Computadora[0];
        Servidor[] arrayServidor=new Servidor[0];
        while (op!=4){
        System.out.println("Bienvenido al sistema \n Que desea hacer? \n 1)Crear celular 2)Crear computadora 3)Crear servidor 4)Funciones especiales 5)Salir");
        Scanner scanner = new Scanner(System.in);
        op = scanner.nextInt();
        switch (op){
            case 1:{
                System.out.println("Creando zona celular:\n");
                int n=0;
                System.out.println("Cuantos dispositivos desea crear?");
                n= scanner.nextInt();
                arrayCelular=new Celular[n];

                for (int x=0; x<n; x++ ){

                    System.out.println("Inserte el nombre del dispositivo "+(x+1)+":" );
                    String name = scanner.next();
                    System.out.println("Inserte la ram del dispositivo (GB) "+(x+1)+":");
                    int ram = scanner.nextInt();
                    System.out.println("Inserte la marca de procesador del dispositivo "+(x+1)+":" );
                    String procesador = scanner.next();
                    System.out.println("Inserte el saldo del dispositivo "+(x+1)+":" );
                    double saldo = scanner.nextDouble();


                    Celular celular=new Celular(name, ram, procesador, saldo );
                    arrayCelular[x]=celular;


                }

                break;
            }
            case 2:{
                System.out.println("Creando zona computadora:\n");
                int n=0;
                System.out.println("Cuantos dispositivos desea crear?");
                n= scanner.nextInt();
                arrayCelular=new Celular[n];

                for (int x=0; x<n; x++ ) {

                    System.out.println("Inserte el nombre del dispositivo " + (x + 1) + ":");
                    String name = scanner.next();
                    System.out.println("Inserte la ram del dispositivo (GB) " + (x + 1) + ":");
                    int ram = scanner.nextInt();
                    System.out.println("Inserte la marca de procesador del dispositivo " + (x + 1) + ":");
                    String procesador = scanner.next();
                    System.out.println("Inserte la marca de teclado del dispositivo " + (x + 1) + ":");
                    String teclado = scanner.next();

                    Computadora computadora = new Computadora(name, ram, procesador, teclado);
                    arrayComputadora[x] = computadora;
                }
                break;
            }
            case 3:{
                System.out.println("Creando servidor:\n");
                int n=0;
                System.out.println("Cuantos servidores desea crear?");
                n= scanner.nextInt();
                arrayCelular=new Celular[n];

                for (int x=0; x<n; x++ ){

                    System.out.println("Inserte la zona horaria del servidor "+(x+1)+":" );
                    String zonaHoraria = scanner.next();


                    Servidor servidor=new Servidor(zonaHoraria);
                    arrayServidor[x]=servidor;


                }

                break;
            }
            case 4:{
                System.out.println("Que funcion especial desea ejecutar: \n 1)Enviar SMS 2)Encender web cam 3)Aumentar ram");
                int f= scanner.nextInt();

                    if (f == 1) {
                        System.out.println("Desde que eclular desea enviar el SMS: ");
                        int g= scanner.nextInt();
                        int j=0;
                        j=g-1;

                        System.out.println("Inserte el mensaje");
                        String sms = scanner.next();
                        arrayCelular[j].setSaldo(1);
                        System.out.println("EL saldo actual del celular "+arrayCelular[j].getName()+ " es de: "+arrayCelular[j].getSaldo());

                    } else if (f == 2) {
                        System.out.println("WebCam encendida");

                    } else if (f == 3) {
                        System.out.println("Seleccione el dispositivo al que desea cambiar ram: \n 1)Celular 2)Computadora");
                        int z = scanner.nextInt();
                        switch (z) {
                            case 1: {
                                System.out.println("A que celular desea aumentar la ram:");
                                int h = scanner.nextInt();
                                int g=0;
                                g=h-1;
                                System.out.println("Inserte la ram que desea aumentar a el celular (GB)");
                                int ñ = scanner.nextInt();

                                System.out.println("Nueva ram para el dispositivo " + h + ": " + (arrayCelular[g].getRam()+ñ)+" GB");
                               break;
                            }
                            case 2: {
                                System.out.println("A que computadora desea aumentar la ram:");
                                int h = scanner.nextInt();
                                System.out.println("Inserte la nueva ram para la computadora (GB)");
                                int p = scanner.nextInt();
                                arrayComputadora[h].setRam(p);
                                System.out.println("Nueva ram para el dispositivo " + h + ":" + arrayComputadora[h].getRam());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Opcion no valida");

                    }

                break;
            }

            default:{
                System.out.println("Gracias por utilizar el sistema");
            }

        }

        }
    }
}
