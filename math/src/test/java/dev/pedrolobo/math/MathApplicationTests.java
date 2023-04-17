package dev.pedrolobo.math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathApplicationTests {

  @Test
  void should_Return_Values_From_Fibonacci_Method() {
    List<Integer>    inputValues = Arrays.asList(0, 1, 2, 3,  7,  14,     30);
    List<Integer> expectedValues = Arrays.asList(0, 1, 1, 2, 13, 377, 832040);

    List<Integer> actualValues = inputValues.stream()
        .map(i -> Fibonacci.evaluate(i))
        .collect(Collectors.toList());

    boolean result = actualValues.equals(expectedValues);

    Assertions.assertTrue(result);
  }

}
