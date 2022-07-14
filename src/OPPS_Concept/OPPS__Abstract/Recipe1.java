package OPPS_Concept.OPPS__Abstract;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the row materials");
        System.out.println("Get the utensil");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("Do the clean up the utensils");
    }
}
