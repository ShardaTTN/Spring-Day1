package q1;

 // (1) Write a program to demonstrate Tightly Coupled code.

public class Food {
    public static void main(String[] args) {
        System.out.println("Food Class");
        ChineseFood C = new ChineseFood();
        C.display();
    }
}
