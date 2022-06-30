package zw.polymorphic.ployparameter;


public class PolyParameterTest {
    public static void main(String[] args) {
        Worker worker1 = new Worker("tom", 5000);
        Manager manager1 = new Manager("milan", 8000, 1500);
        PolyParameterTest.showEmpAnnual(worker1);
        PolyParameterTest.showEmpAnnual(manager1);
        PolyParameterTest.testWork(worker1);
        PolyParameterTest.testWork(manager1);
//        "hello".equals("abc");
    }

    /**
     * 实现获取任何对象的年工资，在main方法中调用
     */
    public static void showEmpAnnual(Employee employee) {
        System.out.println(employee.getAnnual());   //动态绑定机制
    }

    /**
     * testWork方法根据对象的实际类型输出不同对象的动作
     * 目的：是为了解决对象的类型不同且不同对象的动作也不同，因此需要判断对象的类型，再根据对象的实际类型输出不同对象的动作
     */
    public static void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work(); //向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();  //向下转型
        } else {
            System.out.println("输入的类型有误,请检查!");
        }
    }
}
