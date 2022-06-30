package zw.interface_.interface_demo;

public class InterfaceTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.consume();
        bus.charge();
    }
}

abstract class Vehiele {
    abstract void consume();
}

interface fare {
    void charge();
}

class Bus extends Vehiele implements fare {

    @Override
    void consume() {
        System.out.println("Bus使用电力驱动");
    }

    @Override
    public void charge() {
        System.out.println("每人收费2元");
    }
}
