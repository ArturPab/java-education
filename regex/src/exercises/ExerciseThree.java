package exercises;

//Za pomocą wrażeń regularnych należy sprawdzić, czy łańcuch znaków zawiera poprawnie napisaną datę.

public class ExerciseThree {
    static public boolean isFormatOfDateCorrect(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
}
