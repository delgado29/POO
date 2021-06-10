import java.util.Scanner;

public class Teacher extends Persona implements Registrar{
     Teacher[] arrayTeacher=new Teacher[0];
    public Teacher(String name, double matricula) {
        super(name, matricula);
    }
    Scanner scanner=new Scanner(System.in);

    @Override
    public void setDatos() {
        System.out.println("Registrando maestros:\n");
        int n=0;
        System.out.println("Cuantos maestros desea registrar?");
        n= scanner.nextInt();
        arrayTeacher=new Teacher[n];
        for (int k=0;k<n;k++){
            System.out.println("Inserte el nombre del maestro "+(k+1)+":" );
            String name = scanner.next();
            System.out.println("Ingrese la matricula del maestro "+(k+1)+":" );
            double matricula = scanner.nextDouble();

            Teacher teacher=new Teacher(name, matricula );
            arrayTeacher[k]=teacher;
        }



    }
}
