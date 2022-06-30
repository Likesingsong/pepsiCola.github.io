package zw.object_;

public class HashCode {
    public static void main(String[] args) {
        /**
         * 两个不同对象的哈希值肯定是不一样的，且返回的哈希值不是地址，只是根据内部地址转化来的
         */
        AA aa1 = new AA();
        System.out.println("aa1.hashCode() = " + aa1.hashCode());
        AA aa2 = new AA();
        System.out.println("aa2.hashCode() = " + aa2.hashCode());


    }
}

class AA {

}

