package OPPS_Concept.Arrays;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Days of week : "+ Arrays.toString(daysOfWeek));

        String dayWithMostCharacters = "";

        for (String day : daysOfWeek){
            if (day.length() > dayWithMostCharacters.length()){
                dayWithMostCharacters = day;
            }
          //  System.out.println("Day of week : " +day);
        }

        System.out.println("Day with Most number of character : "+dayWithMostCharacters);
        System.out.println("Reverse day of week :------------ ");
        for (int i = daysOfWeek.length - 1; i >= 0; i--){

            System.out.println(daysOfWeek[i]);
        }
    }
}
