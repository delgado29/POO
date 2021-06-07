public class Admin extends User{
    public Admin(String name, String adress, String phone, String userName, String password) {
        super(name, adress, phone, userName, password);
    }
    public void changePassword(String newPassword){
        super.setPassword(newPassword);
    }
}
