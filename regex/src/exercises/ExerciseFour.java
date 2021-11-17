package exercises;


//Wiedząc, że Math.Random() zwraca wartość pseudolosową z zakresu 0
//do 1, napisz pętlę, która wylosuje 100 liczb z zakresu od 0 do 100, wypisze
//mniejsze od 20 i przerwie losowanie, gdy liczb spełniających warunek będzie 10
public class ExerciseFour {
    static public void printNumbers() {
        int correctNumbers = 0;
        for(int i=0; i<100; i++) {
            int number = getRandomInteger();
            if (number>20) {
                System.out.println(number);
                correctNumbers++;
                if(correctNumbers==10) {
                    System.out.println("Loop executed " + (i+1) + " times");
                    break;
                }
            }
        }
    }

    private static int getRandomInteger() {
        return ((int) (Math.random()*(100 - 1))) + 1;
    }

}
