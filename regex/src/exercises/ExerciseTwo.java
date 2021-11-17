package exercises;

import java.util.regex.Pattern;

//Należy napisać program zliczający słowa używając tym razem wyrażeń
//regularnych.
public class ExerciseTwo {
    static public int getWordAmount(String words) {
        String[] wordsArray = getSplit(words.trim());
        return wordsArray.length;
    }

    private static String[] getSplit(String words) {
        Pattern whitespace = Pattern.compile("\\s\\s");
        String matcher = whitespace.matcher(words).replaceAll(" ");
        return matcher.split("\\s");
    }
}
