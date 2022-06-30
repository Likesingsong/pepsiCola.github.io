package zw.interface_.interface_demo;

import javax.lang.model.element.VariableElement;

public class CarShopTest {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();
        carShop.sellCar(new BMW());
        carShop.sellCar(new CheryQQ());
        System.out.println("总收入是:" + carShop.getMoney());

    }
}

/**
 * getName()获取车的名字
 * etPrice()获取车的价格
 */
interface Car {
    String getName();

    int getPrice();
}

class BMW implements Car {

    @Override
    public String getName() {
        return "BWM";
    }

    @Override
    public int getPrice() {
        return 300000;
    }
}

class CheryQQ implements Car {
    @Override
    public String getName() {
        return "CheryQQ";
    }

    @Override
    public int getPrice() {
        return 150000;
    }
}

class CarShop {
    private int money = 0;

    public void sellCar(Car car) {   //获取售车信息
        System.out.println("车型:" + car.getName() + ",单价:" + car.getPrice());
        money += car.getPrice();
    }

    public int getMoney() { //获取总收入
        return money;
    }
}
