package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        String sentence = "Acesta este un program scris in java pentru expresii lambda";
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList(sentence.split(" "))
        );
        ArrayList<String> longwords = new ArrayList<>();
        words.forEach(word -> {
            if(word.length() >= 5)
                    longwords.add(word);
        });

        System.out.println("Numarul de cuvinte lungi = " + longwords.size());
        Collections.sort(longwords);
        longwords.forEach(word -> System.out.println(word));
        System.out.println();
        String pword;
        longwords.forEach(word -> {
            if(word.charAt(0)=='p'){
                System.out.println(word);
            }
        });
    }
}
