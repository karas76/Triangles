import util.IncorrectTriangleException;

public class Triangle {
    /** Геттеры*/
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

    public Double getPerimeter() {
        return perimeter;
    }

    private double perimeter;
    private double square;

    /**
     * Конструктор
     * @param firstSide Первая сторона
     * @param secondSide Вторая сторона
     * @param thirdSide Третья сторона
     * @throws Exception
     */
    Triangle(double firstSide, double secondSide, double thirdSide) throws Exception{
        checkCorrect(firstSide, secondSide, thirdSide);
        fillTriangle(firstSide, secondSide, thirdSide);
        calculatePerimeter();
        calculateSquare();
    }

    /**
     * Проверяет праильность сторон треугольника
     * @param firstSide Первая сторона
     * @param secondSide Вторая сторона
     * @param thirdSide Третья сторона
     * @throws Exception
     */
    private void checkCorrect(double firstSide, double secondSide, double thirdSide) throws Exception{
        if (secondSide + thirdSide <= firstSide)
            throw new IncorrectTriangleException();
        if (thirdSide + firstSide <= secondSide)
            throw new IncorrectTriangleException();
        if (secondSide + firstSide <= thirdSide)
            throw new IncorrectTriangleException();
    }
    /** Получает периметр треугольника*/
    private void calculatePerimeter() {
        perimeter = firstSide + secondSide + thirdSide;
    }
    /** Получает площадь треугольника*/
    private void calculateSquare() {
        square = Math.sqrt(perimeter/2 * (perimeter/2 - firstSide) * (perimeter/2 - secondSide) * (perimeter/2 - thirdSide));
    }
    /** Заполняет треугольники*/
    private void fillTriangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
}
