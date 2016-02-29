import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * �������� ������: ���� ��� ������ Triangle
 * @author ������� �����.
 * ������: ���-42��.
 */
public class TriangleTests {
    /** ������ �����������*/
    Triangle triangle;

    /** ��������� ������*/
    @Before
    public void SetUp() throws Exception{
        triangle = new Triangle(3, 4, 5);
    }

    /** ���� �������� ���������*/
    @Test
    public void testCalculatePerimeter() {
        double ex = 12.0;
        Assert.assertEquals("Incorrect perimeter", ex, triangle.getPerimeter(), 0.001);
    }

    /** ���� �������� �������*/
    @Test
    public void testCalculateSquare() {
        double ex = 6.0;
        Assert.assertEquals("Incorrect square", ex, triangle.getSquare(), 0.001);
    }


}
