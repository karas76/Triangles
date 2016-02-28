import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Roman on 15.12.2015.
 */
/** Сортирует треугольники по площади*/
public class WorkWithTriangles {
    public static void sortTriangles(List<Triangle> triangles) {
       Collections.sort(triangles, (Triangle a, Triangle b) -> a.getSquare().compareTo(b.getSquare()));
    }
}//Тесть сортировки. Всего 5 тестов
