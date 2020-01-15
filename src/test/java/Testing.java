import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.Test;

public class Testing {

    private static final List<TestData> testData = Collections.unmodifiableList(Arrays.asList(
            new TestData("test case 1", "value1", "value2", 1),
            new TestData("test case 2", "value2", "value2", 2),
            new TestData("test case 3", "value2", "value1", 3),
            new TestData("test case 4", "value2", "value2", 4)
    ));

    @Test
    public void aTest() {
        for (final TestData data : testData) {
            System.out.println("***********************");
            System.out.println(data.getTestCase());
            System.out.println(data.getValue1());
            System.out.println(data.getValue2());
            System.out.println(data.getValue3());
        }
    }

    @AllArgsConstructor
    @Getter
    static class TestData {
        private final String testCase;
        private final String value1;
        private final String value2;
        private final int value3;
    }
}
