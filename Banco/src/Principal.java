public class Principal {
    public static void main(String[] args) {
        User u1=new User("u1", 646, "kun", "fu");
        boolean res= u1.iniciarSesion("u1", 646);
        System.out.println(u1.getName()+u1.getLastname());
        System.out.println("Login: "+res+"\n");
        u1.cobrarCheque();

        Client c1 = new Client("c1", 545, "lala", "lolo", 500);
        c1.cargarSaldo(100);
        System.out.println(c1.getSaldo());
        boolean res2= c1.iniciarSesion("c1", 54);
        System.out.println("Login:" +res2);
        c1.cobrarCheque();
    }
}
