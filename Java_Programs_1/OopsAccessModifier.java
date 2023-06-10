class Account {
    // String name; // default
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

// if we want to access private data from outside of class then we need
// getters and setters.

public class OopsAccessModifier {
    public static void main(String args[]) {
        Account ac1 = new Account();
        ac1.name = "Abhijeet";
        ac1.email = "abhijeet@gmail.com";
        ac1.setPassword("abcd");
        System.out.println(ac1.getPassword());
    }
}