package dev.pedrolobo.math;

/*
 *  The Calculator class provides basic arithmetic operations.
 */
public class Calculator {

  /*
   * Returns the sum of two integers.
   * 
   * @param a the first integer to be added.
   * 
   * @param b the second integer to be added.
   * 
   * @return the sum of a and b.
   */
  public static int sum(int a, int b) {
    return a + b;
  }

  /*
   * Returns the difference between two integers.
   * 
   * @param a the first integer to be subtracted from.
   * 
   * @param b the second integer to be subtracted.
   * 
   * @return the difference of a and b.
   */
  public static int subtract(int a, int b) {
    return a - b;
  }

  /*
   * Returns the product of two integers.
   * 
   * @param a the first integer to be multiplied.
   * 
   * @param b the second integer to be multiplied.
   * 
   * @return the product of a and b.
   */
  public static int multiply(int a, int b) {
    return a * b;
  }

  /*
   * Returns the quotient of two floats.
   * 
   * @param a the float to be divided.
   * 
   * @param b the float to divide a by.
   * 
   * @return the quotient of a divided by b.
   * 
   * @throws RuntimeException if b is zero.
   */
  public static int quotient(int a, int b) {
    if (b == 0)
      throw new RuntimeException("error: division by zero.");
    return a / b;
  }

  /*
   * Returns the division of two floats.
   * 
   * @param a the float to be divided.
   * 
   * @param b the float to divide a by.
   * 
   * @return the division of a divided by b.
   * 
   * @throws RuntimeException if b is zero.
   */
  public static float divide(float a, float b) {
    if (Float.compare(b, 0.0f) == 0.0f)
      throw new RuntimeException("error: division by zero.");
    return a / b;
  }
}
