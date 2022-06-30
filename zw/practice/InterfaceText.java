package zw.practice;

interface Car {
    String name();

    int getsale();
}

class BWM implements Car {
    @Override
    public String name() {
        return "BWM";
    }

    @Override
    public int getsale() {
        return 200000;
    }
}

class CherryQQ implements Car {
    @Override
    public String name() {
        return "CherryQQ";
    }

    @Override
    public int getsale() {
        return 40000;
    }
}

public class InterfaceText {
    private int money = 0;

    public void sellCar(Car car) {
        System.out.println("车型:" + car.name() + ",价格:" + car.getsale());
        money += car.getsale();
    }

    public int getMoney() {
        return money;
    }

    public static void main(String[] args) {
        InterfaceText ashop = new InterfaceText();
        ashop.sellCar(new BWM());
        ashop.sellCar(new CherryQQ());
        System.out.println("总收入:" + ashop.getMoney());
    }

}
