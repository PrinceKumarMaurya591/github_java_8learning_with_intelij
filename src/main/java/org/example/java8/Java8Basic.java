package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


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

    public void evenAndOddNumber(){
        int arr[]={1,2,3,4,5,6,7,8,9};
       List<Integer> odd= Arrays.stream(arr).filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> even= Arrays.stream(arr).filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Even number is: "+even);
        System.out.println("Odd number is: "+odd);

    }

}
