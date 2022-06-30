package zw.demo_extends_2;

public class Emploee {
    String name;
    int Salary;

    public Emploee() {
    }

    public Emploee(String name, int salary) {
        this.name = name;
        Salary = salary;
    }

    String getInformation() {
        return "Name is " + name + ",salary is " + Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
