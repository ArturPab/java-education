package tests;

import examples.LambdaExamples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExamplesTest {

    @Test
    void sumLambdaExampleTest() {

//        when
        LambdaExamples examples = new LambdaExamples();


//        given
        int sum = examples.sumLambdaExample(3,2);


//        then
        assertEquals(5, sum);
    }
}