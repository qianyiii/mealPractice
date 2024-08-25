import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // Create recipes
        Recipe recipe1 = new ChickenRecipe("Thai Basil Chicken with Jasmine Rice and Steamed Ginger-Garlic Broccoli", "A delicious and flavorful meal that's easy to make at home.");
        Recipe recipe2 = new ChickenRecipe("Honey Mustard Glazed Chicken with Steamed Asparagus and Sweet Potato Mash", "A delicious and well-balanced dinner that can be prepared in around 1 hour.");

        // Create ingredients
        Ingredient chicken = new Ingredient("Chicken thighs", 5.5, "pounds");
        Ingredient sesame_oil = new Ingredient("Sesame oil", 2, "tablespoons");
        Ingredient thai_basil_leaves = new Ingredient("Thai Basil Leaves", 3, "cups");
        Ingredient pepper = new Ingredient("Red Bell Pepper", 2, "whole");
        Ingredient onion = new Ingredient("Yellow Onion", 1, "whole");
        Ingredient ginger = new Ingredient("Ginger", 2, "inches");
        Ingredient broccoli = new Ingredient("Broccoli", 1, "head");
        Ingredient garlic = new Ingredient("Garlic", 4, "cloves");
        Ingredient black_pepper = new Ingredient("Black Pepper", 1, "teaspoon");
        Ingredient jasmine_rice = new Ingredient("Jasmine rice", 2, "cups");
        Ingredient soy_sauce = new Ingredient("Soy Sauce", 3, "tablespoons");
        Ingredient fish_sauce = new Ingredient("Fish Sauce ", 2, "tablespoons");
        Ingredient brown_sugar = new Ingredient("Brown Sugar", 1, "tablespoon");
        Ingredient chicken_thigh = new Ingredient("Chicken Thigh", 8, "pieces");
        Ingredient greek_yogurt = new Ingredient("Plain Greek Yogurt", 1, "cup");
        Ingredient honey = new Ingredient("Honey", 2, "tablespoons");
        Ingredient mustard = new Ingredient("Dijon Mustard", 2, "tablespoons");
        Ingredient olive_oil = new Ingredient("Olive oil", 2, "tablespoons");
        Ingredient asparagus = new Ingredient("Asparagus", 1, "pound");
        Ingredient sweet_potato = new Ingredient("Sweet Potato", 3, "medium");
        Ingredient shallot = new Ingredient("Shallot", 1, "");
        Ingredient dried_thyme = new Ingredient("Dried Thyme", 2, "teaspoons");
        Ingredient salt = new Ingredient("Shallot", 1, "teaspoon");
        Ingredient black_Pepper = new Ingredient("Black Pepper", 0.5, "teaspoon");


        // Add ingredients to recipes
        recipe1.addIngredient(chicken);
        recipe1.addIngredient(sesame_oil);
        recipe1.addIngredient(thai_basil_leaves);
        recipe1.addIngredient(pepper);
        recipe1.addIngredient(onion);
        recipe1.addIngredient(ginger);
        recipe1.addIngredient(broccoli);
        recipe1.addIngredient(garlic);
        recipe1.addIngredient(black_pepper);
        recipe1.addIngredient(jasmine_rice);
        recipe1.addIngredient(soy_sauce);
        recipe1.addIngredient(fish_sauce);
        recipe1.addIngredient(brown_sugar);

        recipe2.addIngredient(chicken_thigh);
        recipe2.addIngredient(greek_yogurt);
        recipe2.addIngredient(honey);
        recipe2.addIngredient(mustard);
        recipe2.addIngredient(olive_oil);
        recipe2.addIngredient(asparagus);
        recipe2.addIngredient(sweet_potato);
        recipe2.addIngredient(shallot);
        recipe2.addIngredient(dried_thyme);
        recipe2.addIngredient(salt);
        recipe2.addIngredient(black_Pepper);

        /*
        // List ingredients
        recipe1.listIngredients();
        recipe2.listIngredients();

         */
        /* Prepare, cook, and serve instructions
        recipe1.prepareInstructions();
        recipe1.cookInstructions();
        recipe1.serveInstructions();

        recipe2.prepareInstructions();
        recipe2.cookInstructions();
        recipe2.serveInstructions();*/

        // Add cooking steps
        recipe1.addCookingStep("Prepare the rice");
        recipe1.addCookingStep("Cook the chicken");
        recipe1.addCookingStep("Prepare the vegetables");
        recipe1.addCookingStep("Add the sauce");
        recipe1.addCookingStep("Finish with the basil");
        recipe1.addCookingStep("Serve");


        recipe2.addCookingStep("Prepare the Chicken");
        recipe2.addCookingStep("Make the Honey Mustard Glaze");
        recipe2.addCookingStep("Bake the Chicken");
        recipe2.addCookingStep("Prepare the Asparagus");
        recipe2.addCookingStep("Make the Sweet Potato Mash");

        // Display recipe details
        recipe1.displayRecipeDetails();
        System.out.println("");
        recipe2.displayRecipeDetails();

        System.out.println("");
        // Compare recipes by the number of ingredients
        if (recipe1.compareTo(recipe2) > 0) {
            System.out.println(recipe1.getName() + " has more ingredients.");
        } else if (recipe1.compareTo(recipe2) < 0) {
            System.out.println(recipe2.getName() + " has more ingredients.");
        } else {
            System.out.println("Both recipes have the same number of ingredients.");
        }

    }
}