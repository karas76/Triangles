public class Triangle {

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    private double firstSide, secondSide, thirdSide;

    public Double getSquare() {
        return square;
    }
    private double perimeter;
    private double square;

    Triangle(double firstSide, double secondSide, double thirdSide) {
        fillTriangle(firstSide, secondSide, thirdSide);
        calculatePerimeter();
        calculateSquare();
    }
    /** Получает периметр треугольника*/
    private void calculatePerimeter() {
        perimeter = firstSide + secondSide + thirdSide;
    }
    /** Получает площадь треугольника */
    private void calculateSquare() {
        square = Math.sqrt(perimeter * (perimeter - firstSide) * (perimeter - secondSide) * (perimeter - thirdSide));
    }
    /** */
    private void fillTriangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

}
