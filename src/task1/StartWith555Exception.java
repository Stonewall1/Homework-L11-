package task1;

public class StartWith555Exception extends Exception{
    @Override
    public String getMessage() {
        return "String does not start with 555";
    }
}
