import java.util.HashSet;
import java.util.Set;

public class FoodList {
    private Set<Food> foodList = new HashSet<>();

    public Set<Food> getFoodList() {
        return foodList;
    }
    public void addFoodToList(Food food){
       if (food.getName()==null||food.getPrice()==0||food.getWeight()==0){
           throw new RuntimeException("Заполните карточку товара полностью");
       }
        if (!foodList.add(food)){
            throw new RuntimeException("в списке уже есть " + food.getName());
        }
    }
    public void removeFood(Food food){
        if (!foodList.remove(food)){
            throw new RuntimeException("товара в списке нет");
        }
    }
    public void markFood(Food food){
        if (foodList.contains(food)){
            System.out.println(food.getName() + " куплен");
        }
    }
}
