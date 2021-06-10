import java.util.Scanner;

public class Calification implements NewCalification {
    private Materia[] materias;
    private double promedio;
    @Override
    public void setCalifications() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantas materias desea a calificar?");
        int x= scanner.nextInt();
        materias=new Materia[x];
        for(int y=0; y<x; y++){
            System.out.println("Nombre de la materia "+(y+1)+" :");
            String n= scanner.next();
            System.out.println("Calificacion:");
            double c= scanner.nextDouble();

            Materia materia=new Materia(n, c);
            materias[y]=materia;

        }
        this.setPromedio();

    }

    @Override
    public void setPromedio() {
        double p=0;
                for (int x=0; x< materias.length;x++) {
                    p += materias[x].getCalificacion();
                }
                promedio=(p/ materias.length);
        System.out.println("Promedio final: "+promedio);
    }

    public Materia[] getMaterias() {
        return materias;
    }
}
