import exercises.ExerciseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class regexMain {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String st;
    {
        try {
            st = in.readLine();
            System.out.println(ExerciseOne.getSum(st.trim()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
