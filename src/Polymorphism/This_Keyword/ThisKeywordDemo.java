package Polymorphism.This_Keyword;

public class ThisKeywordDemo {

    int x,y;  //instance variables or class variables

    void setData(int x, int y){
        this.x = x;
        this.y = y;

    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeywordDemo th = new ThisKeywordDemo();
        th.setData(50,20);
        th.display();

    }
}
