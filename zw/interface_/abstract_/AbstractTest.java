package zw.interface_.abstract_;

import java.util.zip.CheckedOutputStream;

public class AbstractTest {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.aa(1, 2));
        b.cc();
    }
}


abstract class A {
    private int i = 1;

    abstract int aa(int x, int y);

    abstract void bb();

    public void cc() {
        System.out.println(i);
    }
}

class B extends A {

    @Override
    int aa(int x, int y) {
        return x + y;
    }

    @Override
    void bb() {
    }
}
