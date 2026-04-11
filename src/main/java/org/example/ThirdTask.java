package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdTask {
    private final List<String> memberNames = new ArrayList<>();

    public ThirdTask() {
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
    }

    public List<String> getNamesStartWithAAndLengthGraterThanFive() {
        return memberNames.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> getNamesSortedAscAndLowerCase() {
        return getNamesStartWithAAndLengthGraterThanFive().stream()
                .map(String::toLowerCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public boolean isContainsAllNamesWithLetterS() {
        return memberNames.stream()
                .allMatch(s -> s.contains("S"));
    }

    public boolean isContainsAnyNameWithLetterS() {
        return memberNames.stream()
                .anyMatch(s -> s.contains("S"));
    }

    public boolean isContainsNamesWithLetterH() {
        return memberNames.stream()
                .noneMatch(s -> s.contains("H"));
    }

    public Long countNumberOfStringsWithLetterA() {
        return memberNames.stream()
                .filter(s -> s.startsWith("A"))
                .count();
    }

    public String firstNameStartingWithLetterL() {
        return memberNames.stream()
                .filter(s -> s.startsWith("L"))
                .findFirst().orElse("This list doesn't have string with letter L");
    }

    public void displayList(){
        memberNames.stream().forEach(System.out::println);
    }
}
