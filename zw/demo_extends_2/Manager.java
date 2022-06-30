package zw.demo_extends_2;

public class Manager extends Emploee {
    String department;

    //�޲ι�����
    public Manager() {
    }

    //�вι�����
    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String getInformation() {
        return super.getInformation() + ",manager of " + department;
    }
}
