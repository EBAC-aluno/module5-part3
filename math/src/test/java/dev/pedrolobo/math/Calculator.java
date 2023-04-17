package dev.pedrolobo.math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void should_Return_Values_From_Sum_Method() {
    List<Pair<Integer, Integer>> inputValues = Arrays.asList(
        new Pair<Integer, Integer>(1, 2),
        new Pair<Integer, Integer>(-7, 4),
        new Pair<Integer, Integer>(0, 0),
        new Pair<Integer, Integer>(0, 1));

    List<Integer> expectedValues = Arrays.asList(3, -3, 0, 1);

    List<Integer> actualValues = inputValues.stream()
        .map(pair -> Calculator.sum(pair.inputA, pair.inputB))
        .collect(Collectors.toList());

    boolean result = actualValues.equals(expectedValues);

    Assertions.assertTrue(result);
  }

  @Test
  void should_Return_Values_From_Subtract_Method() {
    List<Pair<Integer, Integer>> inputValues = Arrays.asList(
        new Pair<Integer, Integer>(0, 0),
        new Pair<Integer, Integer>(7, 9),
        new Pair<Integer, Integer>(-6, 4),
        new Pair<Integer, Integer>(1, 1));

    List<Integer> expectedValues = Arrays.asList(0, -2, -10, 0);

    List<Integer> actualValues = inputValues.stream()
        .map(pair -> Calculator.subtract(pair.inputA, pair.inputB))
        .collect(Collectors.toList());

    boolean result = actualValues.equals(expectedValues);

    Assertions.assertTrue(result);
  }

  @Test
  void should_Return_Values_From_Multiply_Method() {
    List<Pair<Integer, Integer>> inputValues = Arrays.asList(
        new Pair<Integer, Integer>(0, 1),
        new Pair<Integer, Integer>(7, 7),
        new Pair<Integer, Integer>(-6, 4),
        new Pair<Integer, Integer>(1, 1));

    List<Integer> expectedValues = Arrays.asList(0, 49, -24, 1);

    List<Integer> actualValues = inputValues.stream()
        .map(pair -> Calculator.multiply(pair.inputA, pair.inputB))
        .collect(Collectors.toList());

    boolean result = actualValues.equals(expectedValues);

    Assertions.assertTrue(result);
  }

  @Test
  void should_Return_Values_From_quotient_Method() {
    List<Pair<Integer, Integer>> inputValues = Arrays.asList(
        new Pair<Integer, Integer>(0, 1),
        new Pair<Integer, Integer>(7, 7),
        new Pair<Integer, Integer>(10, 4),
        new Pair<Integer, Integer>(-10, 2));

    List<Integer> expectedValues = Arrays.asList(0, 1, 2, -5);

    List<Integer> actualValues = inputValues.stream()
        .map(pair -> Calculator.quotient(pair.inputA, pair.inputB))
        .collect(Collectors.toList());

    boolean result = actualValues.equals(expectedValues);

    Assertions.assertTrue(result);
  }

  @Test
  void should_Throw_Exception_From_quotient_Method() {
    RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> Calculator.quotient(3, 0));
    Assertions.assertEquals("error: division by zero.", exception.getMessage());
  }

  @Test
  void should_Return_Values_From_devide_Method() {

    List<Pair<Float, Float>> inputValues = Arrays.asList(
        new Pair<Float, Float>(0.0f, 1.0f),
        new Pair<Float, Float>(10.0f, 5.0f),
        new Pair<Float, Float>(10.0f, -5.0f),
        new Pair<Float, Float>(10.0f, 4.0f),
        new Pair<Float, Float>(10.0f, 3.0f)
    );

    float[] expectedValues = { 0.000f, 2.000f, -2.000f, 2.500f, 3.333f };

    List<Float> actualValuesList = inputValues.stream()
        .map(pair -> Calculator.divide(pair.inputA, pair.inputB))
        .collect(Collectors.toList());

    float[] actualValues = ArrayUtils.toPrimitive(actualValuesList.toArray(new Float[0]), 0.0F);

    Assertions.assertArrayEquals(expectedValues, actualValues, 0.001f);
  }

  @Test
  void should_Throw_Exception_From_devide_Method() {
    RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> Calculator.divide(3, 0));
    Assertions.assertEquals("error: division by zero.", exception.getMessage());
  }

  class Pair<T1, T2> {
    public T1 inputA;
    public T2 inputB;

    public Pair(T1 inputA, T2 inputB) {
      this.inputA = inputA;
      this.inputB = inputB;
    }
  }
}
