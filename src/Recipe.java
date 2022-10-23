import java.util.Objects;

public class Recipe {
    private String name;
    private double totalCost;
    private FoodList foodList;

    public Recipe(String name) {
        this.name = name;
        this.foodList = new FoodList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalCost() {
        if (!foodList.getFoodList().isEmpty()) {
            for (Food food : foodList.getFoodList().keySet()) {
                totalCost += food.getPrice() * foodList.getFoodList().get(food);
            }
        }
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public FoodList getFoodList() {
        return foodList;
    }

    public void setFoodList(FoodList foodList) {
        this.foodList = foodList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", totalCost=" + totalCost +
                ", foodList=" + foodList +
                '}';
    }
}
