package LexCodesPractise.Ex1_Object;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();


        r1.setLength(5);
        System.out.println("Length is: " + r1.getLength());
        r1.setBreadth(20);
        System.out.println("Breadth is: " + r1.getBreadth());
    }
}
