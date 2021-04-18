public class Asteroide {
    private String name;
    private String composition;
    public double distance_of_earth;
    protected double speed;

    public Asteroide(String name, String composition, double distance_of_earth, double speed){
        this.name=name;
        this.composition=composition;
        this.distance_of_earth=distance_of_earth;
        this.speed=speed;
    }

}
