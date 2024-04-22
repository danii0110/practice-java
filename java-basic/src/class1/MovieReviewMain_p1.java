package class1;

public class MovieReviewMain_p1 {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview_p1 mr1 = new MovieReview_p1();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";

        MovieReview_p1 mr2 = new MovieReview_p1();
        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";

        //영화 리뷰 정보 출력
        System.out.println("영화 제목:" + mr1.title + " 리뷰:" + mr1.review);
        System.out.println("영화 제목:" + mr2.title + " 리뷰:" + mr2.review);
    }
}
