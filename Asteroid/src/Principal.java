public class Principal {
    public static void main(String[] args) {
        System.out.println("");


        Asteroide c = new Asteroide("Ceres1", "Hielo", 400000000, 17882);
        Asteroide e = new Asteroide("Euphrosyne31", "Helio", 472000000, 16.6);
        Asteroide v = new Asteroide("Vesta4", "Hierro", 542050000, 0.35);

        System.out.println( c.getName());
        c.setName("CERES 1");
        System.out.println( c.getName());
        System.out.println( c.getComposition());
        System.out.println( c.speed);
        System.out.println( c.distance_of_earth);
        System.out.println("");

        System.out.println( e.getName());
        e.setName("EUPHROSYNE 31");
        System.out.println( e.getName());
        System.out.println( e.getComposition());
        System.out.println( e.speed);
        System.out.println( e.distance_of_earth);
        System.out.println("");

        System.out.println( v.getName());
        v.setName("VESTA 4");
        System.out.println( v.getName());
        System.out.println( v.getComposition());
        System.out.println( v.speed);
        System.out.println( v.distance_of_earth);
        
    }
}

