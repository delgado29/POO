public abstract class Persona {
    private String name;
    private double matricula;

    public Persona(String name, double matricula){
        this.name=name;
        this.matricula=matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
