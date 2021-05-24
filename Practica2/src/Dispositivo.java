public class Dispositivo {
    private String name;
    private  int ram;
    public String procesador;

    public Dispositivo(String name, int ram, String procesador){
        this.name=name;
        this.ram=ram;
        this.procesador=procesador;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }
}
