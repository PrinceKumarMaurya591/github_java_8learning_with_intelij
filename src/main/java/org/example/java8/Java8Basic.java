package org.example.java8;

import java.util.Arrays;

public class Java8Basic {
    public void method1SumOfAllNumber(){
      int number[] = {1, 2, 3, 4, 5};
      int sum=Arrays.stream(number).sum();
      System.out.println("Sum of all number is: "+sum);
    }
    public void AverageOfAllNumber() {
    int []numbers = {1, 2, 3, 4, 5};
    int avg=Arrays.stream(numbers).sum()/numbers.length;
        System.out.println("Average of all number is: " + avg);
//            .ifPresent(avg -> System.out.println("Average of all number is: " + avg));
    }

    public void AverageOfAllNumber2() {
        int []numbers = {1, 2, 3, 4, 5,6};
        Arrays.stream(numbers).average()
            .ifPresent(avg -> System.out.println("Average of all number is: " + avg));
    }

}
