public class Cashier extends User{
    public Cashier(String name, String adress, String phone, String userName, String password) {
        super(name, adress, phone, userName, password);
    }
    public void makePayment(){
        System.out.println("Hacer cobro.");
    }
}
