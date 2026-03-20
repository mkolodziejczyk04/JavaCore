import org.example.FiveTask;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class FiveTaskTests {
    private FiveTask fiveTask = new FiveTask();

    @Test
    void testLetterThatOccurOnTheMap(){
        List<String> list = fiveTask.getLettersFromMap();
        assertThat(list).containsExactly("a", "d", "s", "z");
    }
}
