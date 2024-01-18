package AccessModifiers2;

import AccessModifiers.Test;

public class TestMain extends Test {  //through inheritance we can access the protected variables and methods
    public static void main(String[] args) {

        TestMain t = new TestMain();

        System.out.println(t.x);

        t.m();

    }

}
