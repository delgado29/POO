public class Client extends Person {
    private double credit;
    private double max_credit;

    public Client(String name, String adress, String phone, double credit, double max_credit) {
        super(name, adress, phone);
        this.credit=credit;
        this.max_credit=max_credit;
    }
}
