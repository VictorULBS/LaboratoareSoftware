package lab9;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class AppLab9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        IntStream.range(0, 10).forEach(i -> numbers.add((int) (Math.random()*21)+5));

        numbers.forEach(num -> System.out.println(num));

        System.out.println("Sum = " + numbers.stream().mapToInt(num -> num).sum());
        System.out.println("Max = " + numbers.stream().max(Integer ::compareTo).get() );
        System.out.println("Min = " + numbers.stream().min(Integer::compareTo).get() );

        ArrayList<Integer> numbersNarrowed = new ArrayList<Integer>();

        numbers.forEach(num -> {if(num>=10 && num<=20) numbersNarrowed.add(num);});
        numbersNarrowed.forEach(num -> System.out.println(num));
        System.out.println();

        numbers.stream().map(num -> new Double(num)).forEach(num -> System.out.println(num));

        System.out.println(numbers.contains(12) ? "Lista contine 12" : "Lista nu contine 12");

    }
}
