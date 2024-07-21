package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "학생2";
        s2.age = 16;
        s2.grade = 80;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }

}
