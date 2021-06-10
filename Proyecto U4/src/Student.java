import java.util.Scanner;

public class Student extends Persona implements Registrar{
    Student[] arrayStudent=new Student[0];
    private double semestre;
    public Student(String name, double matricula, double semestre) {
        super(name, matricula);
        this.semestre=semestre;
    }
    Scanner scanner=new Scanner(System.in);
    @Override
    public void setDatos() {
        System.out.println("Registrando alumnos:\n");
        int n=0;
        System.out.println("Cuantos alumnos desea registrar?");
        n= scanner.nextInt();

        arrayStudent=new Student[n];
        for (int k=0;k<n;k++){
            System.out.println("Inserte el nombre del alumno "+(k+1)+":" );
            String name = scanner.next();
            System.out.println("Ingrese la matricula del alumno "+(k+1)+":" );
            double matricula = scanner.nextDouble();
            System.out.println("Ingrese el semestre que lleva el alumno "+(k+1)+":" );
            double s = scanner.nextDouble();

            Student student=new Student(name, matricula, s );
            arrayStudent[k]=student;
        }


    }
}
