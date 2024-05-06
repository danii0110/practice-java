package oop1.ex;

public class RectangleProceduralMain_p1 {
    public static void main(String[] args) {
        Rectangle_p1 rectangleP1 = new Rectangle_p1();
        rectangleP1.width = 5;
        rectangleP1.height = 8;

        int area = rectangleP1.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangleP1.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangleP1.isSquare();
        System.out.println("정사각형 여부: " + square); }

}
