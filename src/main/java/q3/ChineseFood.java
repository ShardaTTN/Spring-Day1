package q3;

import org.springframework.stereotype.Component;

@Component
public class ChineseFood implements Food {

    public void preparingFood(){
        System.out.println("Chinese");
    }
}
