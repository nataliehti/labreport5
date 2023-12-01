import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class CheckApple implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("apple");
  }
}

public class ListExamplesTests {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<String> input1 = Arrays.asList("apple", "banana", "Apple");
    CheckApple sc = new CheckApple();
    List<String> output1 = ListExamples.filter(input1, sc);
    assertEquals(
      Arrays.asList(new String[] { "apple", "Apple"}),
      output1
    );
  }

  @Test(timeout = 500)
  public void testMerge() {
    List<String> input1 = Arrays.asList("c", "e", "f", "g");
    List<String> input2 = Arrays.asList("a", "b", "e", "j");
    List<String> output1 = ListExamples.merge(input1, input2);
    assertEquals(
      Arrays.asList(new String[] { "a", "b", "c", "e", "e", "f", "g", "j" }),
      output1
    );
  }

  // todo add more tests
}
