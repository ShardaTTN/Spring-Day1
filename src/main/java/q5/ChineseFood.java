package q5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChineseFood implements Food{
    public void preparingFood(){
        System.out.println("Chinese Food");
    }
}
