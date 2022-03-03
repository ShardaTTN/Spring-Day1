package q6;

public class ChineseFood {

    private String foodItem;

    public ChineseFood(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "ChineseFood{" +
                "foodItem='" + foodItem + '\'' +
                '}';
    }



}
