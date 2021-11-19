package exercises;

//Należy napisać program sortujący liczby zapisane w tablicy liczb. Dane są wprowadzane z konsoli użytkownika i wyprowadzane na ekran.

public class ExerciseFour {

    public static int[] getSortedNumbers(int[] unsortedNumbers) {
        if(unsortedNumbers.length>1) {
            quickSort(unsortedNumbers, 0, unsortedNumbers.length-1);
        }
        return unsortedNumbers;
    }

    private static void quickSort(int[] unsortedNumbers, int low, int high) {
        if(low < high) {
            int pi = partition(unsortedNumbers, low, high);

            quickSort(unsortedNumbers, low, pi-1);
            quickSort(unsortedNumbers, pi+1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];

        int indexOfSmallerElement = (low - 1);

        for(int currentIndexOfNumbers = low; currentIndexOfNumbers<high; currentIndexOfNumbers++) {
            if(numbers[currentIndexOfNumbers] < pivot){
                indexOfSmallerElement++;
                swap(numbers, indexOfSmallerElement, currentIndexOfNumbers);
            }
        }
        swap(numbers, indexOfSmallerElement+1, high);
        return (indexOfSmallerElement+1);
    }

    private static void swap(int[] numbers, int indexOfSmallerElement, int currentIndexOfNumbers) {
        int temp = numbers[indexOfSmallerElement];
        numbers[indexOfSmallerElement] = numbers[currentIndexOfNumbers];
        numbers[currentIndexOfNumbers] = temp;
    }
}
