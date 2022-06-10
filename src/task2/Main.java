package task2;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Your access is : " + Validation.validate("Ilya", "1ilya1", "1ilya1"));
        } catch (WrongLoginException  | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}