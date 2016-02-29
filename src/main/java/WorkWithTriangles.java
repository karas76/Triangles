import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Описание класса: Сортирует список треугольников
 * @author Карасев Роман
 * Группа: ИВТ-42БО
 */
/** Сортирует треугольники по площади*/
public class WorkWithTriangles {
    /**
     * Сортирует список треугольников по площади
     * @param triangles Список треугольников
     */
    public static void sortTriangles(List<Triangle> triangles) {
       Collections.sort(triangles, (Triangle a, Triangle b) -> a.getSquare().compareTo(b.getSquare()));
    }
}
