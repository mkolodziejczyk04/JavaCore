import org.example.ThirdTask;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ThirdTaskTests {
    private final ThirdTask thirdTask = new ThirdTask();
    private final String expectedPrefix = "A";
    private final List<String> processedStrings = thirdTask.getNamesStartWithAAndLengthGraterThanFive();
    private final List<String> stringsAfterSecondModification = thirdTask.getNamesSortedAscAndLowerCase();


    @Test
    public void namesStartsWithAAndLengthOfEachElementIsHigherThanFive() {
        assertThat(processedStrings).allMatch(s -> s.startsWith(expectedPrefix), "Numbers should start with A");
        assertThat(processedStrings).allMatch(s -> s.length() > 5, "Size of each element should be higher than 5");
    }

    @Test
    void namesInLowerCaseAndSorted() {
        assertThat(stringsAfterSecondModification).allMatch(s -> s.startsWith(expectedPrefix.toLowerCase()), "Numbers should start with a");
        assertThat(stringsAfterSecondModification).allMatch(s -> s.length() > 5, "Size of each element should be higher than 5");
        assertThat(stringsAfterSecondModification).as("Each element should be sorted ASC").isSortedAccordingTo(Comparator.naturalOrder());
        assertThat(stringsAfterSecondModification).allMatch(s -> s.equals(s.toLowerCase()), "Each element should be lower case");
    }

    @Test
    void containsStringWithLetterS() {
        boolean actualResult = thirdTask.isContainsNamesWithLetterS();
        assertThat(actualResult).as("This list is not having string with letter S").isFalse();
    }

    @Test
    void notContainsStringWithLetterS() {
        boolean actualResult = thirdTask.isNotContainsNamesWithLetterS();
        assertThat(actualResult).as("This list contains string with letter S").isTrue();
    }

    @Test
    void notContainsStringWithLetterH() {
        boolean actualResult = thirdTask.isContainsNamesWithLetterH();
        assertThat(actualResult).as("This list is not having string with letter H").isTrue();
    }

    @Test
    void howManyStringsIsHavingLetterA() {
        Long numberOfStringsWithLetterA = thirdTask.countNumberOfStringsWithLetterA();
        long expectedResult = 3L;
        assertThat(numberOfStringsWithLetterA).as("This list is not having 3 strings with letter A").isEqualTo(expectedResult);
    }

    @Test
    void firstNameStartingWithL() {
        String expectedName = "Lokesh";
        String actualResult = thirdTask.firstNameStartingWithLetterL();
        assertThat(actualResult).as("This list doesn't have first name starting with L").isEqualTo(expectedName);
    }
}
