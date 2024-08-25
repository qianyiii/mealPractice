import java.util.ArrayList;

public class ChickenRecipe extends Recipe {
     ChickenRecipe(String name, String description) {
        super(name, description);
    }

    @Override
    public void gatherIngredients() {
        System.out.println("Gathering ingredients for " + getName() + ":");
        listIngredients();
    }

    @Override
    public void cook() {
        System.out.println("Cooking the " + getName() + " according to the recipe.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning up after cooking " + getName() + ".");
    }

    @Override
    public void displayRecipeDetails() {
        System.out.println("Recipe: " + getName());
        System.out.println("\nDescription: " + getDescription());
        System.out.println("\nIngredients:");
        for (Ingredient ingredient : getIngredients()) {
            System.out.println(ingredient.getName() + " - " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }
        System.out.println("\nCooking Steps:");
        int stepNumber = 1;
        for (String step : getCookingSteps()) {
            System.out.println("Step " + stepNumber + ": " + step);
            stepNumber++;
        }
    }
}
