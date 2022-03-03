package q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    @Autowired
    Food food;

    public Food getFood(){
        return food;
    }

    public void cooking(){
        System.out.println("cooking...");
        food.preparingFood();
    }

}
