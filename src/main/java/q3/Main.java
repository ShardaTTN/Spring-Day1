package q3;

  //(3) Use @Component and @Autowired annotations to in Loosely Coupled code for dependency management

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Food food = (Food) context.getBean("italianFood");
        food.preparingFood();

    }
}
