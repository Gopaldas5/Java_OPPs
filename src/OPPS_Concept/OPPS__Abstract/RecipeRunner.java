package OPPS_Concept.OPPS__Abstract;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe1 = new Recipe1();
        recipe1.execute();

        System.out.println("-----------------------------------------------------");

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
