import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FoodList {
    private Map<Food, Integer> foodList = new HashMap<>();

    public Map<Food, Integer> getFoodList() {
        return foodList;
    }

    public void addFoodToList(Food food, int count) {
        if (food.getName() == null || food.getPrice() == 0 || food.getWeight() == 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (foodList.containsKey(food)) {
            throw new RuntimeException("в списке уже есть " + food.getName());
        }
        if (count < 1) {
            count = 1;
        }
        foodList.put(food, count);
    }

    public void removeFood(Food food) {
        if (!foodList.containsKey(food)) {
            throw new RuntimeException("товара в списке нет");
        }
        foodList.remove(food);
    }

    public void markFood(Food food) {
        if (foodList.containsKey(food)) {
            System.out.println(food.getName() + " куплен");
        }
    }
}
