package task1;

public class Main {
    public static void main(String[] args) {
        String document = "1234-ABC-5678-Def-9h0K";
        System.out.println("Document number : " + document);

        WorkingWithString.blockOfNumbers(document);
        WorkingWithString.letterReplacement(document);
        WorkingWithString.onlyLettersInLowerCase(document);
        WorkingWithString.onlyLettersInUpperCase(document);
        try {
            WorkingWithString.checkLetters(document);
        } catch (ABCException e) {
            e.printStackTrace();
        }
        try {
            WorkingWithString.checkNumbers(document);
        } catch (StartWith555Exception e) {
            e.printStackTrace();
        }
        try {
            WorkingWithString.checkNumbersEnd(document);
        } catch (EndWith1a2bException e) {
            e.printStackTrace();
        }
    }
}
