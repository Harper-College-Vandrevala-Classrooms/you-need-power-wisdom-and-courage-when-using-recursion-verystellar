package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  void test1() {
    assertEquals(1, calculator.value(1));
  }
  @Test
  void test2() {
    assertEquals(3, calculator.value(2));
  }
  @Test
  void test3() {
    assertEquals(10, calculator.value(4));
  }
  @Test
  void test4() {
    assertEquals(2, calculator.add(1,1));
  }
  @Test
  void test5() {
    assertEquals(9, calculator.add(2,3));
  }
  @Test
  void test6() {
    assertEquals(13, calculator.add(2,4));
  }
  @Test
  void test7() {
    assertEquals(0, calculator.subtract(1,1));
  }
  @Test
  void test8() {
    assertEquals(-3, calculator.subtract(2,3));
  }
  @Test
  void test9() {
    assertEquals(7, calculator.subtract(4,2));
  }
}
