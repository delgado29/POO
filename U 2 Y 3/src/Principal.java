import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int op=0;
        int co=0;
        Banco[] arrayBanco=new Banco[500];
        Prestamo[] arrayPrestamo=new Prestamo[500];
        while (op!=5) {
            System.out.println("Que quieres hacer? \n 1)Crear nuevo prestamo\n 2)Imprimir dinero disponible\n 3)Imprimir pago con tasa\n 4)Imprimir contrato \n 5)Salir");
            op=scanner.nextInt();
            switch (op) {
                case 1:{

                    System.out.println("Creando prestamo. \n No.Contrato: ");
                    co=scanner.nextInt();
                    arrayPrestamo=new Prestamo[co];

                    for (int x=0; x<co; x++ ){

                        System.out.println("Banco: " );
                        String name = scanner.next();
                        System.out.println("Fecha: ");
                        double date = scanner.nextDouble();
                        System.out.println("Tasa de interes (%): " );
                        double interes = scanner.nextDouble();
                        System.out.println("Abono:" );
                        double abono = scanner.nextDouble();
                        System.out.println("Monto a prestar:" );
                        double monto = scanner.nextDouble();
                        System.out.println("Firma:" );
                        String firma = scanner.next();


                        Prestamo prestamo=new Prestamo(name, interes, monto, date, monto, abono, firma );
                        arrayPrestamo[x]=prestamo;


                    }

                    break;
                }
                case 2:{
                    System.out.println("No.Contrato:");
                    int cc= scanner.nextInt()-1;

                    arrayPrestamo[cc].imprimirDineroDisponible();
                    break;
                }
                case 3:{
                    System.out.println("No.Contrato:");
                    int cc= scanner.nextInt()-1;

                    arrayPrestamo[cc].imprimirPagoconTasa();
                break;
                }
                case 4:{
                    System.out.println("No.Contrato:");
                    int cc= scanner.nextInt()-1;
                    arrayPrestamo[cc].imprimirContrato();
                    break;
                }
                default:{
                    System.out.println("Opcion incorrecta.");
                }
            }//switch
        }
    }
}
