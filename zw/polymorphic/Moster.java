package zw.polymorphic;

public class Moster {
    private String name;

    public Moster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*
    //主人给狗喂食物
    public void feed(Dog dog, Bone bone){
        System.out.println("主人" + name + "给" + dog.getName() + "投喂了" + bone.getName());
    }
    //主人给猫喂食物
    public void feed(Cat cat, Fish fish){
        System.out.println("主人" + name + "给" + cat.getName() + "投喂了" + fish.getName());
    }

        */
    //经过测试可以看出，如果动物和食物的种类不断增加，(代码的复用性不高)代码将不方便管理和维护

    //使用多态解决此类问题
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "投喂了" + food.getName());
    }


}
