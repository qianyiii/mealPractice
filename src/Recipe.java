import java.util.ArrayList;

public abstract class Recipe implements RecipeInstructions, IngredientManagement, Comparable<Recipe> {
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> cookingSteps;



    protected Recipe(String name, String description) {
        this.name = name;
        this.description = description;
        this.ingredients = new ArrayList<>();
        this.cookingSteps = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getCookingSteps() {
        return cookingSteps;
    }

    public abstract void gatherIngredients();
    public abstract void cook();
    public abstract void cleanUp();

    // Abstract method to display recipe details
    public abstract void displayRecipeDetails();

    // Implement methods from RecipeInstructions
    @Override
    public void prepareInstructions() {
        System.out.println("Prepare the ingredients for " + name + " according to the instructions.");
    }

    @Override
    public void cookInstructions() {
        System.out.println("Cook the " + name + " as described.");
    }

    @Override
    public void serveInstructions() {
        System.out.println("Serve the " + name + " hot and fresh.");
    }

    // Implement methods from IngredientManagement
    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public void deleteIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
        System.out.println(ingredient.getName() + " removed from " + name);
    }

    @Override
    public void listIngredients() {
        System.out.println("\nIngredients for " + name + ":");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName() + " - " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }
    }

    public void addCookingStep(String step) {
        cookingSteps.add(step);
    }

    // Implement Comparable<Recipe> to compare recipes by the number of ingredients
    @Override
    public int compareTo(Recipe other) {
        return Integer.compare(this.ingredients.size(), other.ingredients.size());
    }

}