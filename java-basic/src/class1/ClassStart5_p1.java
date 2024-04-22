package class1;

public class ClassStart5_p1 {
    public static void main(String[] args) {
        Student_p1 student1 = new Student_p1();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student_p1 student2 = new Student_p1();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //배열 선언
        Student_p1[] students = new Student_p1[]{student1, student2};

        //for문 적용
        for (Student_p1 s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
