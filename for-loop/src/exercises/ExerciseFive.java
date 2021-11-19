package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Należy napisać program sortowania tak aby porządkowała liczby od  najmniejszej do największej. Liczby są zapisane w pliku tekstowym dane.txt(pojedyncza liczba w jednej linii teksu). Program sprawdza poprawność konwersji liczb z pliku.
public class ExerciseFive {
    public static int[] getSortedNumbersFromFile(String path) {
        try {
            int[] numbers = getNumbersFromFile(path);
            Arrays.sort(numbers);

            return numbers;
        } catch (InputMismatchException e) {
            printException("Nieprawidłowy format");
        } catch (FileNotFoundException e) {
            printException("Nie znaleziono pliku");
        }

        return new int[]{};
    }

    private static int[] getNumbersFromFile(String path) throws FileNotFoundException {
        int[] numbers = new int[1];
        int indexOfNumbers = 0;
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext()) {
            numbers = getFilledNumbersArray(numbers, indexOfNumbers, scanner);
            indexOfNumbers++;
        }
        scanner.close();
        return numbers;
    }

    private static int[] getFilledNumbersArray(int[] numbers, int indexOfNumbers, Scanner scanner) {
        if(indexOfNumbers == numbers.length)
            numbers = extendArray(numbers);
        numbers[indexOfNumbers] = scanner.nextInt();
        return numbers;
    }

    private static int[] extendArray(int[] numbers) {
        int[] biggerArray = new int[numbers.length+1];
        System.arraycopy(numbers, 0, biggerArray, 0, numbers.length);
        
        return biggerArray;
    }

    private static void printException(String exceptionMessage) {
        System.out.println(exceptionMessage);
    }
}
