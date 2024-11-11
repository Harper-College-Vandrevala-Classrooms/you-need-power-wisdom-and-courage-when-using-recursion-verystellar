package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
  @Test
  void test10() {
    assertEquals(2, calculator.subtract(2,1));
  }
  @Test
  void test11() {
    assertEquals(30, calculator.multiply(2,4));
  }
  @Test
  void test12() {
    assertEquals(10, calculator.divide(4,1));
  }
  @Test
  void test13() {
    assertEquals(1.25, calculator.divide(9,8));
  }
  @Test
  void test14() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(3);
    expected.add(6);
    expected.add(10);
    expected.add(15);
    assertEquals(expected, calculator.sequence(5));
  }
}
