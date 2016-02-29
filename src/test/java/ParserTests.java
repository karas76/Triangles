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
        WorkWithTriangles.sortTriangles(parser.getListTriangles()); //��������� ������
        //���� ������, ������ �� ��������� �����. �� �� ��������������. �� ��� ����������. � ����������� � ����������� ������� �������������. ���� ������ ����� ������� � � ��� ��� ������������ ������������.
    }

    @Test
    public void TestGetSumTr() {
        int ex = 5;
        Assert.assertSame("�� �����", ex, parser.getAmountTriangles());

    }

}
