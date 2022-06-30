package zw.polymorphic.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        /**
         * 将父类和子类放在同一数组中
         * 包括：一个Person对象，两个Student对象，两个Teacher对象，并调用它们的say方法
         */
        Person[] person = new Person[5];
        person[0] = new Person("tom", 18);
        person[1] = new Student("jack", 19, 95);
        person[2] = new Student("alice", 18, 88);
        person[3] = new Teacher("smith", 39, 5000);
        person[4] = new Teacher("bob", 52, 9500);
        for (int i = 0; i < person.length; i++) {
            //这里存在动态绑定，person数组的编译类型都是Person,但是它的运行类型要根据实际情况
            System.out.println(person[i].say());
            //由于person[i]是Person类型，无法直接调用其子类的特有方法
            /**
             * person[i].study();
             *person[i].teach();
             * 解决：使用instanceof 判断每个对象是否是预期的类型
             */
            if (person[i] instanceof Student) {   //通过if语句已经判断对象符合预期类型
                //向下转型
                Student student = (Student) person[i];
                student.study();
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            } else if (person[i] instanceof Person) {

            } else {
                System.out.println("类型有误，请检查!");
            }

        }
    }
}
