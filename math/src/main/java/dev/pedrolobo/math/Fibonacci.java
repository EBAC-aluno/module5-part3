package dev.pedrolobo.math;

public class Fibonacci{
  public static int evaluate(int n) {
    if (n <= 1) return n;
    return evaluate(n - 1) + evaluate(n - 2);
  }
}


