package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();
        FourthTask fourthTask = new FourthTask();
        FiveTask fiveTask = new FiveTask();

        System.out.println("Task 1.1: ");
        firstTask.displayNumbers();

        System.out.println("Task 1.2: ");
        List<Integer> randomNumbers = firstTask.getRandomNumbers();
        randomNumbers.forEach(System.out::println);

        System.out.println("Task 1.3: ");
        List<Integer> evenNumber = firstTask.getEvenNumbers(randomNumbers);
        evenNumber.forEach(System.out::println);

        System.out.println("Task 2.4: ");
        List<Integer> numbers = secondTask.getNumbers();
        Arrays.stream(secondTask.getEvenNumbers(numbers))
                .forEach(System.out::println);

        System.out.println("Task 2.5: ");
        List<String> convertedStrings = secondTask.getNamesStartingWithC();
        convertedStrings.forEach(System.out::println);

        System.out.println("Task 3.6 a): ");
        List<String> names = thirdTask.getNamesStartWithAAndLengthGraterThanFive();
        names.forEach(System.out::println);

        System.out.println("Task 3.6 b): ");
        List<String> processedNames = thirdTask.getNamesSortedAscAndLowerCase();
        processedNames.forEach(System.out::println);

        System.out.println("Task 3.7: ");
        thirdTask.isContainsNamesWithLetterS();

        boolean containLetterS = thirdTask.isContainsNamesWithLetterS();
        System.out.println(containLetterS);

        boolean notContainLetterS = thirdTask.isNotContainsNamesWithLetterS();
        System.out.println(notContainLetterS);

        boolean notContainLetterH = thirdTask.isContainsNamesWithLetterH();
        System.out.println(notContainLetterH);

        System.out.println("Task 3.9: ");
        System.out.println(thirdTask.countNumberOfStringsWithLetterA());

        System.out.println("Task 3.10: ");
        System.out.println(thirdTask.firstNameStartingWithLetterL());

        System.out.println("Task 4.11: ");
        List<Integer> singleList = fourthTask.convertIntoSingleList();
        singleList.forEach(System.out::println);

        String[] oneDimensionArray = fourthTask.convertIntoOneDimensionArray();
        Arrays.stream(oneDimensionArray).forEach(System.out::println);

        System.out.println("Task 4.12: ");
        ArrayList<Integer> listWithoutDuplicates = fourthTask.removeDuplicates();
        listWithoutDuplicates.forEach(System.out::println);

        System.out.println("Task 5.13");
        List<String> listOfLetters = fiveTask.getLettersFromMap();
        listOfLetters.forEach(System.out::println);
    }

}
