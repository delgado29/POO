public class Materia {
    private String name;
    private double calificacion;

    public Materia(String name, double calificacion){
        this.name=name;
        this.calificacion=calificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
