import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Food bananas = new Food("бананы", 100, 1);
        Food apples = new Food("яблоки", 50, 2);
        Food milk = new Food("молоко", 110, 1);
        Food meat = new Food("мясо", 200, 1.5);
        FoodList foodList1 = new FoodList();
        FoodList foodList = new FoodList();
        foodList.addFoodToList(bananas,2);
        foodList.addFoodToList(apples,4);
        foodList.addFoodToList(milk,1);
        foodList.addFoodToList(meat,8);
        foodList1.addFoodToList(bananas,4);
        foodList1.addFoodToList(milk,2);
        Recipe recipe = new Recipe("рецепт");
        recipe.setFoodList(foodList);
        Recipe recipe1 = new Recipe("рецепт 1");
        recipe1.setFoodList(foodList1);
        Set<Recipe> recipes = new HashSet<>();
        Recipe recipe2 = new Recipe("рецепт 2");
        recipe2.setFoodList(foodList1);
        Recipe[] recipesArray = new Recipe[]{
                recipe, recipe1, recipe2, recipe1
        };
        for (Recipe recipe3 : recipesArray) {
            try {


                if (!recipes.add(recipe3)) {
                    throw new RuntimeException("рецепт существует");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("стоимость рецепта " + recipe3.getName() + " " + recipe3.getTotalCost());
        }
    }
}