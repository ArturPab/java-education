package exercises;

//Napisz program wypisujący na ekran liczby kolejne liczby naturalne z wykorzystaniem pętli for.

import java.util.stream.IntStream;

public class ExerciseOne {
    public static void printNumbers(int endNumber) {
        for (int i = 1; i <= endNumber; i++) {
            System.out.println(i);
        }
    }
}
