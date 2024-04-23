package ref;

public class Method1_p1 {
    public static void main(String[] args) {
        Student_p1 student1 = new Student_p1();
        initStudent(student1, "학생1", 15, 90);

        Student_p1 student2 = new Student_p1();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }
    static void initStudent(Student_p1 student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student_p1 student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}
