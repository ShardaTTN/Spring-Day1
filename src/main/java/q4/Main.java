package q4;

   // (4) Get a Spring Bean from application context and display its properties.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("q4.xml");
        Restaurant restaurant = context.getBean(Restaurant.class);
        System.out.println(restaurant);


    }
}
