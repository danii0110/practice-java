package construct;

public class MethodInitMain1_p1 {
    public static void main(String[] args) {
        MemberInit_p1 member1 = new MemberInit_p1();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit_p1 member2 = new MemberInit_p1();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit_p1[] members = {member1, member2};

        for (MemberInit_p1 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
