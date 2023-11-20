public class Method {
    public static void main(String[] args) {
        Person p = new Person();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20? 15,外部字段修改不影响实基本类型内部
        
        Another_Person p2 = new Another_Person();
        String[] fullname = new String[] { "Homer", "Simpson" };
        p2.setName(fullname); // 传入fullname数组
        System.out.println(p2.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(p2.getName()); // "Homer Simpson"还是"Bart Simpson"? Homer,引用类型的是
    }
}

class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Another_Person {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
