/**
 * Demonstrates:
 * - public
 * - private
 * - controlled access
 */
class BankAccount {

    // Public variable
    public String username;

    // Private variable
    private String password;

    // Setter method for password
    public void setPassword(String pwd) {
        password = pwd;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();

        myAcc.username = "AmritRaj";

        // Cannot access directly because password is private
        // myAcc.password = "abcd";

        // Correct approach
        myAcc.setPassword("abcd123");

        System.out.println("Username: " + myAcc.username);
        System.out.println("Password: " + myAcc.getPassword());
    }
}