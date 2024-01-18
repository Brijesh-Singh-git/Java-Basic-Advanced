package LexCodesPractise.Ex1_Object;

public class Rectangle {

    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    void calculatePerimeter(){

//        int l = getLength();
//        int b = getBreadth();

        System.out.println("Perimeter is: " + 2*(length + breadth));
    }


}
