package q1;

public class ChineseFood {
    ItalianFood It;
    public ChineseFood() {
        It = new ItalianFood();
    }
    public void display(){
        System.out.println("preparing Chinese Food");
        It.display();
    }
}
