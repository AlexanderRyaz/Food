public class Main {
    public static void main(String[] args) {
        Food bananas = new Food("бананы", 100, 1);
        Food apples = new Food("яблоки", 50, 2);
        Food milk = new Food("молоко", 110, 1);
        Food meat = new Food("мясо", 0, 0);
        FoodList foodList = new FoodList();
        try {


            foodList.addFoodToList(bananas);
            foodList.markFood(bananas);
            foodList.addFoodToList(apples);
            foodList.markFood(apples);
            foodList.addFoodToList(milk);
            foodList.markFood(milk);
            foodList.addFoodToList(meat);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        foodList.markFood(meat);
        try {

            foodList.addFoodToList(bananas);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        foodList.markFood(bananas);
        foodList.removeFood(apples);
        for (Food food : foodList.getFoodList()) {
            System.out.println(food);
        }


    }
}