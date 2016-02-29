import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 12.02.2016.
 */
public class TriangleTests {
    /** Объект треугольник*/
    Triangle triangle;

    /** Настройки тестов*/
    @Before
    public void SetUp() throws Exception{
        triangle = new Triangle(3, 4, 5);
    }

    /** Тест подсчёта периметра*/
    @Test
    public void testCalculatePerimeter() {
        double ex = 12.0;
        Assert.assertEquals("Incorrect perimeter", ex, triangle.getPerimeter(), 0.001);
    }

    /** Тест подсчёта площади*/
    @Test
    public void testCalculateSquare() {
        double ex = 6.0;
        Assert.assertEquals("Incorrect square", ex, triangle.getSquare(), 0.001);
    }


}
