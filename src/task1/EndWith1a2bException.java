package task1;

public class EndWith1a2bException extends Exception {
    @Override
    public String getMessage() {
        return "String does not end with 1a2b";
    }
}
