package zw.polymorphic.ployparameter;

public class Worker extends Employee {
    public Worker(String name, int salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("工人 " + getName() + " 正在工作");
    }

    @Override
    public double getAnnual() { //没有其他收入
        return super.getAnnual();
    }
}
