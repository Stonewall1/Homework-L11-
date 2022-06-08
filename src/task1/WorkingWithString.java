package task1;

public class WorkingWithString {
    public static void blockOfNumbers(String str) {
        String[] array = str.split("-");
        System.out.println(array[0] + array[2]);
    }

    public static void letterReplacement(String str) {
        String[] array = str.split("-");
        String newStr = str.replace(array[1], "***");
        String newStr1 = newStr.replace(array[3], "***");
        System.out.println(newStr1);
    }

    public static void onlyLettersInLowerCase(String str) {
        String[] array = str.split("[\\d-]+");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i].toLowerCase());
            if (i != array.length - 1) {
                System.out.print("/");
            }
        }
        System.out.println();
    }

    public static void onlyLettersInUpperCase(String str) {
        StringBuilder SB = new StringBuilder(str);
        String letters = "Letters : ";
        System.out.println(letters + SB.substring(5, 8).toUpperCase() + "/" + SB.substring(14, 17).toUpperCase() + "/" +
                SB.substring(19, 20).toUpperCase() + "/" + SB.substring(21, 22).toUpperCase());
    }

    public static void checkLetters(String str) throws ABCException {
        if (str.contains("ABC") || str.contains("abc")) {
            System.out.println("Contains");
        } else throw new ABCException();
    }

    public static void checkNumbers(String str) throws StartWith555Exception {
        if (str.startsWith("555")) {
            System.out.println("True");
        } else throw new StartWith555Exception();
    }

    public static void checkNumbersEnd(String str) throws EndWith1a2bException {
        if (str.endsWith("1a2b")) {
            System.out.println("True");
        } else throw new EndWith1a2bException();
    }
}
