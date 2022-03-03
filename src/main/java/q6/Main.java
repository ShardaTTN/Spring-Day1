package q6;

   //(6) Perform Constructor Injection in a Spring Bean

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("q6.xml");
        ChineseFood food = context.getBean(ChineseFood.class);
        System.out.println(food);


    }
}
