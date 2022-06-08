package task1;

public class ABCException extends Exception{
    @Override
    public String getMessage() {
        return "String does not contain ABC letters";
    }
}
