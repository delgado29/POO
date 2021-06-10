import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {



        int op=0;

        while (op!=3) {
            System.out.println("Que desea realizar? \n 1)Calificar y obtener promedio\n 2)Registrar nuevo alumno o maestro\n 3)Salir ");
            Scanner scanner=new Scanner(System.in);
            op=scanner.nextInt();
            switch (op) {
                case 1: {
                    Calification calification = new Calification();
                    calification.setCalifications();
                }break;
                case 2:{
                    int y=0;
                    while (y!=3){
                        System.out.println("Que desea registrar?\n 1)Alumno \n 2)Maestro \n 3)Volver ");
                        y= scanner.nextInt();
                        switch (y){
                            case 1:{
                                Student student=new Student("",0,0);
                                student.setDatos();
                                break;}
                            case 2:{
                                Teacher teacher=new Teacher("", 65);
                                teacher.setDatos();
                                break;}
                            default:{
                                System.out.println("Opcion no valida");
                            }
                        }
                    }


                }break;
                case 3:{
                    System.out.println("Gracias por utilizar el sistema");
                }break;
                default:{
                    System.out.println("Opcion no valida");
                }
            }
        }
    }
}
