package zw.demo_extends_2;

public class Employer {
    private String name;
    private String WorkPlace;

    public Employer(String name, String workPlace) {
        this.name = name;
        WorkPlace = workPlace;
    }

    public void chuchai(String workPlace) {
        System.out.println(this.name + "Ҫ��" + this.WorkPlace + "ȥ" + workPlace + "����~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkPlace() {
        return WorkPlace;
    }

    public void setWorkPlace(String workPlace) {
        WorkPlace = workPlace;
    }

    public static void main(String[] args) {
        Employer e = new Employer("����", "����");
        System.out.println(e.getName());
        System.out.println(e.getWorkPlace());
        e.chuchai("�Ϻ�");
    }
}
