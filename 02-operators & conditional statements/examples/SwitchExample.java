//Demostration of Switch statement.

public class SwitchExample {
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Jalebi");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}