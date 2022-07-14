package OPPS_Concept.OPPS__Abstract;

public class RecipeWithMicrowave extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Get stuff ready");
        System.out.println("Put it in the microWave");
    }

    @Override
    void cleanup() {
        System.out.println("Clean the utensils");
        System.out.println("Switch off the microwave");

    }
}
