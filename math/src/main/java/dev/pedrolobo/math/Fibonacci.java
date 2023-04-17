package dev.pedrolobo.math;

/*
 * The Fibonacci class provides a method for evaluating the nth Fibonacci number.
 */
public class Fibonacci {

  /*
   *
   * Returns the nth Fibonacci number.
   * 
   * @param n the position of the Fibonacci number to evaluate.
   * 
   * @return the nth Fibonacci number.
   * 
   * @throws RuntimeException if n is negative.
   */

  public static int evaluate(int n) {
    if (n < 0)
      throw new RuntimeException("error: n must be a non-negative integer.");
    if (n <= 1)
      return n;
    return evaluate(n - 1) + evaluate(n - 2);
  }
}
