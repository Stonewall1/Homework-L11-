package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Re-enter login");
        }
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(password);
        if (password.length() > 20 || password.contains(" ") || !matcher.find()) {
            throw new WrongPasswordException("Re-enter password");
        }
        return password.equals(confirmPassword);
    }
}
