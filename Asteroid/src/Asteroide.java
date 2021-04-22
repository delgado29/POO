public class Asteroide {
    private String name;
    private String composition;
    public double distance_of_earth;
    protected double speed;

    //Constructor
    public Asteroide(String name, String composition, double distance_of_earth, double speed){
        this.name=name;
        this.composition=composition;
        this.distance_of_earth=distance_of_earth;
        this.speed=speed;
    }

    //setters and getters
    public void setName (String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }


    public void setComposition (String composition){
        this.composition=composition;

    }

    public String getComposition() {
        return composition;
    }
}
