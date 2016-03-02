import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * �������� ������: ���� ��� ������ Parser
 * @author ������� �����.
 * ������: ���-42��.
 */

public class ParserTests {
    /** ������ ������*/
    Parser parser;

    /** ��������� ������*/
    @Before
    public void setUp() throws Exception{
        parser = new Parser(IOStreamer.inFile("src\\\\test\\\\java\\\\testInput.txt"));
    }

    /** ���� ��������� ���������� �������������*/
    @Test
    public void TestGetSumTr() {
        int ex = 5;
        Assert.assertSame("Not equal", ex, parser.getAmountTriangles());

    }
    /** ���� ��������� ������ �������������*/
    @Test
    public void testCalculateTriangles() throws Exception {
        Assert.assertFalse("Wrong list triangles", isListTrianglesNotCorrect());
    }
    public boolean isListTrianglesNotCorrect() throws Exception {
        List<Triangle> ex = new ArrayList<>();
        ex.add(new Triangle(5, 10, 9));
        ex.add(new Triangle(45, 25, 34));
        ex.add(new Triangle(5, 4, 7));
        ex.add(new Triangle(4, 8, 5));
        ex.add(new Triangle(8, 6, 4));

        boolean check = true;
        for(int i = 0; i < 5; i++) {
            ex.get(i).getSquare();
            if (parser.getListTriangles().get(i).getSquare().equals(ex.get(i).getSquare())) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }

}
