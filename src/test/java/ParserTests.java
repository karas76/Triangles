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
    }

    @Test
    public void TestGetSumTr() {
        int ex = 5;
        Assert.assertSame("Не равны", ex, parser.getAmountTriangles());

    }

}
