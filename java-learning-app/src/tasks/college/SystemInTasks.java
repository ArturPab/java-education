package tasks.college;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SystemInTasks {
    private Scanner scan = new Scanner(System.in);

//    Write a new program, which will rewrite entered lines on screen until typed "quit"
    public void taskOne() {
        writeUntilQuit();
    }

//    Write a new program, which will sum char 'a' in entered string
    public void taskTwo() {
        String text = scan.nextLine();
        System.out.println("Sum of 'a': " + getSumSmallA(text));
    }

//    Write program, which will replace multiple white spaces to one white space during rewriting in to out
    public void taskThree() {
        String text = scan.nextLine();
        for(int charIndex = 0; charIndex < text.length(); charIndex++) {
            rewriteTextWithoutWhiteSpace(text, charIndex);
        }
    }

    //    Write a new program, which will sum substring 'ab' in entered string
    public void taskFour() {
        String text = scan.nextLine();
        System.out.print("Sum of ab: " + getABSubstringSum(text));
    }

    public int getABSubstringSum(String text) {
        return (int) IntStream.range(0, text.length()).filter(charIndex -> text.charAt(charIndex) == 'b' && charIndex != 0).filter(charIndex -> text.charAt(charIndex - 1) == 'a').count();
    }

    private void rewriteTextWithoutWhiteSpace(String text, int charIndex) {
        if(!isWhiteSpace(text, charIndex))
            if(charIndex ==0)
                System.out.print(text.charAt(charIndex));
            else if (isWhiteSpace(text, charIndex - 1)) {
                System.out.print(" " + text.charAt(charIndex));
            } else {
                System.out.print(text.charAt(charIndex));
            }
    }

    private boolean isWhiteSpace(String text, int charIndex) {
        return text.charAt(charIndex) == '\t' || text.charAt(charIndex) == ' ';
    }

    //    method returns sum of letter 'a' in text
    private int getSumSmallA(String text) {
        return (int) IntStream.range(0, text.length()).filter(charIndex -> text.charAt(charIndex) == 'a').count();
    }

    private void writeUntilQuit() {
        String line;
        do {
            line = scan.nextLine();
        } while (!line.equals("quit"));
    }
}
