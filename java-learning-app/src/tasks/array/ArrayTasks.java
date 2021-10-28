package tasks.array;

import java.util.Arrays;

public class ArrayTasks {
//    Write a Java program to convert array of integers to array of strings
    public void convertIntArrayToStringArray(int[] givenIntArray) {
        String[] stringArray = Arrays.stream(givenIntArray).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.stream(stringArray).forEach(System.out::print);
    }

//    Write a Java program to form the largest :number from a given list of non negative integers.
    public void formLargestNumberTask(int[] givenIntArray) {
        int unityDigit = 1;
        int largestNumber=0;

        Arrays.sort(givenIntArray);
        printArray(givenIntArray);

        for(int i=0; i<givenIntArray.length; i++) {
            largestNumber += (givenIntArray[i]*unityDigit);
            unityDigit*=10;
        }

        System.out.println("Largest number: " + largestNumber);
    }

//    Write a Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.
    public void weirdSortTask(int[] sortedArray) {
        int arrayLength = sortedArray.length;
        int[] weirdSortedArray = new int[arrayLength];

        System.out.println("Before sorting: ");
        printArray(sortedArray);
        weirdSort(weirdSortedArray, sortedArray, arrayLength);
        System.out.println("After sorting: ");
        printArray(weirdSortedArray);
    }

    private void weirdSort(int[] weirdSortedArray, int[] sortedArray, int arrayLength) {
        boolean flag = false;
        int minimumIndex = arrayLength-1;
        int maximumIndex = 0;

        for(int i = 0; i < arrayLength; i++) {
            if(flag)
                weirdSortedArray[i] = sortedArray[maximumIndex++];

            else
                weirdSortedArray[i] = sortedArray[minimumIndex--];

            flag=!flag;
        }
    }

    public void sumTask(int[] array) {
        int sum = 0;
        for(int element: array) sum += element;
        System.out.println("Sum of array: " + Arrays.toString(array) + "= " + sum);
    }

    //    Write a Java program to sort a numeric array and a string array
    public void sortTask() {
        sortNumericArray();
        sortStringArray();
    }

    private void sortStringArray() {
        String[] stringArray={"elo", "sa", "Ar"};
        System.out.println("Before sort:");
        printArray(stringArray);   // printing array

        Arrays.sort(stringArray);   //sorting array
        System.out.println("After sort:");
        System.out.println(Arrays.toString(stringArray));
    }

    private void printArray(String[] stringArray) {
        System.out.println(Arrays.toString(stringArray));
    }

    private void printArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }

    private void sortNumericArray() {
        int[] intArray = {5,3,1,8,4,2};
        System.out.println("Before sort:");
        printArray(intArray); // printing array

        Arrays.sort(intArray); //sorting array
        System.out.println("After sort:");
        printArray(intArray);
    }
}
