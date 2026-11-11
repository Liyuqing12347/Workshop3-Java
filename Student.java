public class Student {
    String name;
    int age;

    public void showInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "LiHua";
        s1.age = 18;
        s1.showInfo();

        Student s2 = new Student();
        s2.name = "ZhangSan";
        s2.age = 19;
        s2.showInfo();
    }
}
