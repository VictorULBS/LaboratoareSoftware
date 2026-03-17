package ro.ulbs.proiectaresoftware.lab1;

public class Application {

    public boolean isCharInString(char c, String str) {
        return str.indexOf(c) >= 0;
    }

    public static void main(String[] args) {
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
}
