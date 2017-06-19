package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Fibonacci {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  
  public static BigInteger fibNumber (int n) {
    if (n <= 0) {
      return BigInteger.ZERO;
    }
    if (n == 1) {
      return BigInteger.ONE;
    }
    return fibNumber(n - 1).add(fibNumber(n - 2));
  }
}
