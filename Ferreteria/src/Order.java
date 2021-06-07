import java.util.Scanner;

public class Order implements NewOrder{
    private double total;
    private Part[] partes;
    private Client client;
    private Cashier cashier;

    public Order(Client client, Cashier cashier){
        this.client=client;
        this.cashier=cashier;
        this.setParts();
    }

    @Override
    public void setParts() {
        System.out.println("Cuantas partes necesitas?");
        Scanner scanner=new Scanner(System.in);
        int cp= scanner.nextInt();
        partes=new Part[cp];
        for (int x=0; x<cp; x++){
            partes[x]=new Part("jjj"+x, 6565*x, "kclen");
        }
        this.setTotal();
    }

    @Override
    public void setClient() {

    }

    @Override
    public void setTotal() {
        for(int x=0; x< partes.length; x++)
            total=total+partes[x].getPrice();
    }

    public double getTotal() {
        return total;
    }
}
