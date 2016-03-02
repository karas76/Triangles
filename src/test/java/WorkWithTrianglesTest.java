import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Описание класса: Тест класса WorkWithTriangles
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
*/

public class WorkWithTrianglesTest {
    /**Объект парсер*/
    Parser parser;
    /** Настройки тестов*/
    @Before
    public void setUp() throws Exception {
        parser = new Parser(IOStreamer.inFile("src\\\\test\\\\java\\\\testInput.txt"));
    }

    /**
     * Тест сортировки треугольников по площади
     * @throws Exception
     */
    @Test
    public void testSortTriangles() throws Exception {
        Assert.assertFalse("Sort is not correct", isSortTrianglesNotEqual());
    }
    public boolean isSortTrianglesNotEqual() throws Exception {
        WorkWithTriangles.sortTriangles(parser.getListTriangles());
        List<Triangle> ex = new ArrayList<>();
        ex.add(new Triangle(4, 8, 5));
        ex.add(new Triangle(5, 4, 7));
        ex.add(new Triangle(8, 6, 4));
        ex.add(new Triangle(5, 10, 9));
        ex.add(new Triangle(45, 25, 34));

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

