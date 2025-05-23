package org.example.java8;

import java.util.Arrays;
import java.util.List;


public class Java8Basic {
    public void method1SumOfAllNumber(){
      int[] number = {1, 2, 3, 4, 5};
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

    // even and odd number
    public void evenAndOddNumber(){
        int[] arr={1,2,3,4,5,6,7,8,9};
       List<Integer> odd= Arrays.stream(arr).filter(n->n%2==0).boxed().toList();
        List<Integer> even= Arrays.stream(arr).filter(n->n%2!=0).boxed().toList();
        System.out.println("Even number is: "+even);
        System.out.println("Odd number is: "+odd);

    }

    //number staert with prefix 2
    public void numberStartWithPrefix2(){
        List<String> numbers = Arrays.asList("123", "456", "789", "234", "567");
        List<String> filteredNumbers = numbers.stream()
                .filter(number -> number.startsWith("2"))
                .toList();
        System.out.println("Numbers starting with prefix 2: " + filteredNumbers);
    }

}
