public class User {
    private String user;
    private double password;
    private String name;
    private String lastname;
    public  User(String user, double password,String name, String lastname){
        this.name=name;
        this.lastname=lastname;
        this.user=user;
        this.password=password;

    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {

        return user;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public double getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean iniciarSesion(String user, double password){
        if(user.equals(this.user) && password==this.password){
            return  true;
        }else{
            return false;
        }
    }
    public double cobrarCheque(){
        return 100*15;

    }
}
