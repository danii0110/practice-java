package ref;

public class Method2_p1 {
    public static void main(String[] args) {
        Student_p1 student1 = createStudent("학생1", 15, 90);
        Student_p1 student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }
    static Student_p1 createStudent(String name, int age, int grade) {
        Student_p1 student = new Student_p1();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void printStudent(Student_p1 student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}
