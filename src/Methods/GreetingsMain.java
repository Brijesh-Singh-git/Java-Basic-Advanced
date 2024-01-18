package Methods;

public class GreetingsMain {
    public static void main(String[] args) {

        Greetings gr = new Greetings();

        gr.greetings1(); //1

        //String str = gr.greetings2(); //2
        //System.out.println(str);

        System.out.println(gr.greetings2()); //2

        gr.greetings3("Mohan Singh");//3


        String str1 = gr.greetings4("Developer"); //4
        System.out.println(str1);

    }
}
