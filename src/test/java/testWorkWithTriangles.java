import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 28.02.2016.
 */
public class testWorkWithTriangles {
    Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser(IOStreamer.inFile("src\\\\test\\\\java\\\\testInput.txt"));

    }

    @Test
    public void testSortTriangles() throws Exception {
        Assert.assertFalse("Sort is not correct", isSortTrianglesNotEqual());
    }
    public boolean isSortTrianglesNotEqual() throws Exception {
        List<Triangle> ex = new ArrayList<>();
        ex.add(new Triangle(5, 4, 7));
        ex.add(new Triangle(4, 8, 5));
        ex.add(new Triangle(8, 6, 4));
        ex.add(new Triangle(5, 10, 9));
        ex.add(new Triangle(45, 25, 34));
        boolean check = true;
        for(int i = 0; i < 5; i++) {
            if (parser.getListTriangles().get(i).equals(ex.get(i))) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
        //Assert.assertSame("Не равны", ex.get(0).getSquare(), parser.getListTriangles().get(0).getSquare());
    }

}
