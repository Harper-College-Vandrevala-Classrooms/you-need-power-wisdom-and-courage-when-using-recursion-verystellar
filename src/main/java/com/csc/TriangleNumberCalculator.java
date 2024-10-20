package com.csc;

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
}
