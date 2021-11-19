package exercises;

//Należy napisać program wczytujący do tablicy 𝑛 liczb całkowitych i wypisujący element najmniejszy i największy.
public class ExerciseThree {
    public static int[] getMinAndMax(int[] numbers) {
        if (numbers.length==0) {
            return numbers;
        }
        int[] minMaxNumbers = new int[2];
        minMaxNumbers[0] = numbers[0];
        minMaxNumbers[1] = numbers[0];

        if(numbers.length>1) {
            for(int number: numbers) {
                if(number < minMaxNumbers[0])
                    minMaxNumbers[0] = number;
                else if(number > minMaxNumbers[1])
                    minMaxNumbers[1] = number;
            }
        }
        for (int number: minMaxNumbers)
            System.out.println(number);

        return minMaxNumbers;
    }
}
