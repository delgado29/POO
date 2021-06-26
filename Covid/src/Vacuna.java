public class Vacuna {

    private String nombre;
    private String maraVacuna;
    private int nDosis;

    public Vacuna(String nombre, String maraVacuna, int nDosis) {
        this.nombre = nombre;
        this.maraVacuna = maraVacuna;
        this.nDosis = nDosis;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaraVacuna() {
        return maraVacuna;
    }

    public void setMaraVacuna(String maraVacuna) {
        this.maraVacuna = maraVacuna;
    }

    public int getnDosis() {
        return nDosis;
    }

    public void setnDosis(int nDosis) {
        this.nDosis = nDosis;
    }
}
