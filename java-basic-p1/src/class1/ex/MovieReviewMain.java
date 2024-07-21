package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview m1 = new MovieReview();
        m1.title = "인셉션";
        m1.review = "인생은 무한 루프";

        MovieReview m2 = new MovieReview();
        m2.title = "어바웃 타임";
        m2.review = "인생 시간 영화";

        MovieReview[] mrs = new MovieReview[2];
        mrs[0] = m1;
        mrs[1] = m2;

        //영화 리뷰 정보 출력
        for (int i = 0; i < mrs.length; i++) {
            MovieReview m = mrs[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}
