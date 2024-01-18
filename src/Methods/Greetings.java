package Methods;

public class Greetings {

    //1. No params No return value

    void greetings1(){
        System.out.println("Hello....");
    }

    //2. No params Returns a value

    String greetings2(){
        return "Hello... how are you ?";
    }

    //3 Takes params NO return value

    void greetings3(String name){
        System.out.println("Hello my name is : " + name) ;
    }

    //4 Takes params and Returns a value
    String greetings4(String designation){

        return ("Hello my designation is: " + designation);
    }
}
