public class Principal {
    public static void main(String[] args) {
        Admin admin1=new Admin("admin","calletal","6560000000", "admin", "123");
        Cashier cashier1=new Cashier("cajero1","avenida","6363332211", "c1","123");
        cashier1.makePayment();
        User cashier2=new Cashier("cajero1","avenida","6363332211", "c1","123");

    Client client=new Client("Luis","avhn","6560002222", 0, 20000);
    Order order=new Order(client, cashier1);

        System.out.println(order.getTotal());
    }
}
