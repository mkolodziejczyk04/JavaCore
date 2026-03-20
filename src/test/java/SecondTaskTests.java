import org.example.SecondTask;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SecondTaskTests {
    private final SecondTask secondTask = new SecondTask();
    private final String expectedPrefix = "C";
    private final List<Integer> randomNumbers = secondTask.getNumbers();

    @Test
    public void containsOnlyEvenNumbers() {
        Integer[] evenNumbers = secondTask.getEvenNumbers(randomNumbers);
        assertThat(evenNumbers).allMatch(s -> s % 2 == 0, "All numbers should be even");
    }

    @Test
    void startsWithCAndConverted() {
        List<String> processedValues = secondTask.getNamesStartingWithC();
        assertThat(processedValues).as("It should start with: C").allMatch(s -> s.startsWith(expectedPrefix));
        assertThat(processedValues).as("It should be sorted descending")
                .isSortedAccordingTo(Comparator.reverseOrder());
        assertThat(processedValues).allMatch(s -> s.equals(s.toUpperCase()), "All Letters should be upper case");
    }
}
