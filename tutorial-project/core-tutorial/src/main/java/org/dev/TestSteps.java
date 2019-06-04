package org.dev;

public class TestSteps {
    static void f (int x) {
        System.out.println ("num is " + (x+0)); // <- step into
    }

    static void g (int x) {
      f(x); // <----------------------------------- current location
        f(1); // <----------------------------------- step over
    }

    public static void main (String args[]) {
        g(2);
        g(3); // <----------------------------------- step out of
    }
}

