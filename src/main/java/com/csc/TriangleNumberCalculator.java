package com.csc;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {
   int value(int a){
       if (a == 1) return 1;
       return (a + value(a-1));
   }

   int add(int a, int b){
       return value(a) + value(b);
   }
    int subtract(int a, int b){
        return value(a) - value(b);
    }

    int multiply(int a, int b){
       return value(a) * value(b);
    }

    double divide(int a, int b){
       return (double) value(a) / value(b);
    }

    List<Integer> sequence(int a){
       List<Integer> sequence = new ArrayList<Integer>();
       for (int i = 1; i <= a; i++) {
           sequence.add(value(i));
       }
       return sequence;
    }
}
