package ro.ulbs.proiectaresoftware.lab1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;



public class Application {

    static String[] splitSmallTextFileIntoWords(String fileName) throws IOException {

        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);

        String text = Files.readAllLines(path).getFirst();
        String[] words = text.split(" ");

        printWordList(words);
        return words;
    }

    static String[] splitSmallTextFileIntoLines(String fileName) throws IOException {

        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);

        String text = Files.readAllLines(path).getFirst();
        String[] linesByPeriod = text.split("\\.");

        printWordList(linesByPeriod);
        return linesByPeriod;
    }

    static void writeSmallTextFile(String fileName, String[] text) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, List.of(text));
    }

    static void printWordList(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

    static void alfabet(){
        //INIT VARS
        String alfabet = "";
        String regex = "(?=e)|(?=i)|(?=o)|(?=u)"; //aeiou

        //INIT ALFABET
        for(int i=0; i<26; i++){
            alfabet += (char)('a'+i);
        }

        //INIT ARRAYS
        String[] array = alfabet.split(regex);
        String[] UpperCaseArray = alfabet.toUpperCase().split(regex.toUpperCase());

        //PRINT ALFABET + ARRAYS
        System.out.println(alfabet);
        System.out.println(alfabet.toUpperCase());
        System.out.println();
        for(String s : array){
            System.out.println(s);
        }
        System.out.println();
        for(String s : UpperCaseArray){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        try{
            String[] words = splitSmallTextFileIntoWords("in.txt");
            writeSmallTextFile("out.txt", words);
            String[] lines = splitSmallTextFileIntoLines("in.txt");
            //writeSmallTextFile("out.txt", lines); //ISSUE: overrides previous text
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
