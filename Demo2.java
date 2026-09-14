public class Demo2 {
    public static void main(String[] args) {
        College college = new College("KIET", "Nothing");
        Student s1 = new Student(21, "Vivek Verma", college);
        System.out.println(/*s1.getAge() + " " + s1.getName() + " " +*/ s1.getCollege().name);  //KIET
        s1.getCollege().name = "GL Bjaj";
        System.out.println(s1.getCollege().name);    //GL Bjaj
    }
}
// Immutable class
// defensive copy of college(non primitive)
final class Student {
    final private int age;
    final private String name;
    final private College college;

    // Student(){}
    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name,college.adderess);
    }

    // getter
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.adderess);
    }
}

class College {
    String name;
    String adderess;

    College(String name, String adderess) {
        this.name = name;
        this.adderess = adderess;
    }
}

