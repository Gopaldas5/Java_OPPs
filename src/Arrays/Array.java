package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

        public static void main(String[] args) {

            int[] array = {1, 8, 4, 3, 6, 9, 6, 7};
            System.out.println(" printing the array element in different ways ");

            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }
            System.out.println("\n -------------------------------------------");

            for (int i = 0; i < array.length; i++) {
                if (i != 0) {                   // separating the number by commas(,)
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println(" .");          // ending with dot (.)

            System.out.println("--------------------------------------------");


            // separating the string by commas and printing the array

            String[] supportedPhones = {"iPhone", "Samsung Galaxy", "iPad"};
            String models = String.join(",", supportedPhones);   // by creating obj

            System.out.println("array: " + Arrays.toString(supportedPhones));
            System.out.print("string: " + models);
            System.out.println(".");


            System.out.println("---------------------------------------------");

            for (int i:array){
                System.out.print(" "+i);
            }

            System.out.println("\n----------------------------------------------");

            System.out.println("Index           Value");
            int lemon[] = {12, 15, 65, 76, 43, 50};
            for (int x = 0; x < lemon.length; x++){
                System.out.println( x+"               "+lemon[x]);
            }

            System.out.println("----------------------------------------------");

            int a[] = new int[5];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the elements :- ");
            for (int i = 0; i < a.length; i++){
                a[i] = scanner.nextInt();
            }
            System.out.print("Array elements :- ");
            for (int i = 0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.print("\nReverse array elements :- ");
            for (int i = a.length-1;i>=0;i--){
                System.out.print(a[i]+" ");
            }

        }
}


