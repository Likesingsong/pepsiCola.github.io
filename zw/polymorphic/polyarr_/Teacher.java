package zw.polymorphic.polyarr_;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "工资:" + salary;
    }

    //特有的方法
    public void teach() {
        System.out.println("老师 " + getName() + " 正在教Java~");
    }
}
