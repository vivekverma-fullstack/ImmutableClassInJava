// Immutable_Class

class Demo {
    public static void main(String[] args) {

        College college = new College("KIET", "Nothing");
        Student s1 = new Student(21, "Vivek Verma", college);
        System.out.println(s1.getAge() + " " + s1.getName() + " " + s1.getCollege().name);
        s1.getCollege().name = "GL Bjaj";
        System.out.println(s1.getCollege().name);
    }
}
// Not purelly Immutable
final class Student {
    final private int age;
    final private String name;
    final private College college;

    // Student(){}
    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getter
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return this.college;
    }
}
// mutable
class College {
    String name;
    String adderess;

    College(String name, String adderess) {
        this.name = name;
        this.adderess = adderess;
    }
}
