package class1;

public class MovieReviewMain2_p1 {
    public static void main(String[] args) {
        MovieReview_p1[] reviews = new MovieReview_p1[2];

        MovieReview_p1 mr1 = new MovieReview_p1();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";
        reviews[0] = mr1;

        MovieReview_p1 mr2 = new MovieReview_p1();
        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";
        reviews[1] = mr2;

        //영화 리뷰 정보 출력
        for (MovieReview_p1 review : reviews) {
            System.out.println("영화 제목:" + review.title + ", 리뷰:" + review.review);
        }
    }
}
