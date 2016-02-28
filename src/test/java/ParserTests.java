import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman on 11.02.2016.
 */
public class ParserTests {
    /** Parser object. */
    Parser parser;

    /**
     * Setting up unit tests.
     */
    @Before
    public void setUp() throws Exception{
        parser = new Parser(IOStreamer.inFile("src\\\\test\\\\java\\\\testInput.txt"));
        WorkWithTriangles.sortTriangles(parser.getListTriangles()); //сортирует список
        //Есть список, взятый из тестового файла. Он не отсортированый. Ты его сортируешь. И сравниваешь с контрольным списком треугольников. Этот список задан вручную и в нем уже сортированые треугольники.
        //parser.removeExtraSpaces();
    }
    @Test
    public void testRemovingExtraSpaces() throws Exception {
        List<Triangle> ex = new ArrayList<>();
        ex.add(new Triangle(5, 4, 7));
        ex.add(new Triangle(5, 10, 9));
        ex.add(new Triangle(4, 8, 5));
        ex.add(new Triangle(45, 25, 34));
        ex.add(new Triangle(8, 6, 4));

        //Дальше добавляешь
        Assert.assertFalse("More when one space founded!", listTrianglesNotCorrect(parser.getListTriangles(), ex));
    }
    @Test
    public boolean listTrianglesNotCorrect(List<Triangle> list, List<Triangle> ex) {
        if (list.equals(ex)) {
            return false;
        } else {
            return true;
        }
    }
    @Test
    public void TestGetSumTr() {
        int ex = 2;
        Assert.assertSame("Не равны", ex, parser.getAmountTriangles());

    }

}
