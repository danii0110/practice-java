package construct;

public class MethodInitMain2_p1 {
    public static void main(String[] args) {
        MemberInit_p1 member1 = new MemberInit_p1();
        initMember(member1, "user1", 15, 90);

        MemberInit_p1 member2 = new MemberInit_p1();
        initMember(member2, "user2", 16, 80);

        MemberInit_p1[] members = {member1, member2};

        for (MemberInit_p1 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
    static void initMember(MemberInit_p1 member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
