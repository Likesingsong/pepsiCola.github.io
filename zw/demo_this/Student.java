package zw.demo_this;

public class Student {
    private String name;
    private String SchoolName;

    public Student() {
    }

    public Student(String name, String schoolName) {
        this.name = name;
        this.SchoolName = schoolName;
    }

    public Student(String name) {
        this(name, "不用上学校");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        this.SchoolName = schoolName;
    }
}