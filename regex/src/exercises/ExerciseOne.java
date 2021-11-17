package exercises;

//        We wprowadzonym wierszu użytkownik podał wpisał kilka liczb. Liczby są
//        przedzielone spacjami. Spacje mogą również występować na początku i na
//        końcu wprowadzonego łańcucha znaków. Należy obliczyć sumę podanych liczb.
//        Program należy zrealizować w interfejsie angielskim bez użycia skanera za
//        pomocą buforowanego streamera.

import java.util.Arrays;
import java.util.regex.Pattern;

public class ExerciseOne {

    public static int getSum(String numbersAsString) {
        String[] stringAsNumbersArray = getSplit(numbersAsString);
        System.out.println(Arrays.toString(stringAsNumbersArray));
        int sum = 0;
        for(String number: stringAsNumbersArray) sum += Integer.parseInt(number);

        return sum;
    }

    private static String[] getSplit(String numbersAsString) {
        Pattern whitespace = Pattern.compile("\\s\\s");
        String matcher = whitespace.matcher(numbersAsString).replaceAll(" ");
        return matcher.split("\\s");
    }
}
