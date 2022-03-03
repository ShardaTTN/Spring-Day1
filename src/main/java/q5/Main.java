package q5;

  // (5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.cooking();

    }
}
