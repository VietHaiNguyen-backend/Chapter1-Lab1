package p3;

import p1.P;

public class P3 extends p1.P {
    private void test() {
        P fristObj = new P();
        fristObj.a = 10;
        fristObj.b = 10;
        c = 10; // Protected
        fristObj.d = 10;
    }

    public static void main(String[] args) {

    }
}
