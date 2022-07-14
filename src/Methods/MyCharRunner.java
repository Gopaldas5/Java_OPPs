package Methods;

import java.util.Scanner;

public class MyCharRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter : ");

//        String str = scanner.next();
//        char ch = str.charAt(0);

        char ch = scanner.next().charAt(0);

        MyChar myChar = new MyChar(ch);

        System.out.println("It is for vowel: "+myChar.isVowel());
        System.out.println("It is for Digit: "+myChar.isDigit());
        System.out.println("It is for Alphabet: "+myChar.isAlphabet());
        System.out.println("It is for consonant: "+myChar.isConsonant());
        System.out.println("__________________________________________________________");
        System.out.println("Print lower case Alphabet:- ");
        MyChar.printLowerCaseAlphabet();
        System.out.println(" ");
        System.out.println("___________________________________________________________");
        System.out.println("Print upper case Alphabet:- ");
        MyChar.printUpperCaseAlphabet();
    }
}
