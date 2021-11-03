package examples;

public class LambdaExamples {

    public int sumLambdaExample(int numberA, int numberB) {
        Calculator calculator = (a, b) -> Integer.sum(a, b);

        return calculator.sum(numberA, numberB);
    }




}
