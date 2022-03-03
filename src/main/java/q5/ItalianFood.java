package q5;

import org.springframework.stereotype.Component;

@Component
public class ItalianFood implements Food{
    public void preparingFood(){
        System.out.println("Italian Food");
    }
}
