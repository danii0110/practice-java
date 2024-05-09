package construct;

public class ConstructMain2_p1 {
    public static void main(String[] args) {
        MemberConstruct_p1 member1 = new MemberConstruct_p1("user1", 15, 90);
        MemberConstruct_p1 member2 = new MemberConstruct_p1("user2", 16);

        MemberConstruct_p1[] members = {member1, member2};

        for (MemberConstruct_p1 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
