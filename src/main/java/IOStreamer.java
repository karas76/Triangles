import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Roman on 19.10.2015.
 */
public class IOStreamer {
    /** Получает список строк из файла */
    /**
     *
     * @param fileName Имя входного файла
     * @return
     * @throws Exception
     */
    public static List<String> inFile(String fileName) throws Exception {
        List<String> listString = new ArrayList();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            listString.add(scanner.nextLine());
        }
        return listString;
    }
    /** Записывает стороны и площади треугольников в файл */
    /**
     *
     * @param triangles Список треугольников
     * @param printWriter
     * @throws Exception
     */
    public static void printInfoAboutTriangles(List<Triangle> triangles, PrintWriter printWriter) throws Exception {
        for (Triangle triangle : triangles ) {
            printWriter.println("Sides: " + triangle.getFirstSide() + " " + triangle.getSecondSide() + " " + triangle.getThirdSide() + " " + " Square = " + triangle.getSquare());
        }
    }
    /** Записывает результат в файл*/
    /**
     *
     * @param filename Имя файла результатов
     * @param triangle
     * @throws Exception
     */
    public static void printToFile(String filename, List<Triangle> triangle) throws Exception{
        PrintWriter printWriter = new PrintWriter(filename);
        printInfoAboutTriangles(triangle, printWriter);
        printWriter.close();

    }
    /** Записывает результат в консоль*/
    /**
     *
     * @param triangle Список треугольников
     * @throws Exception
     */
    public static void printToConsole(List<Triangle> triangle) throws Exception{
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printInfoAboutTriangles(triangle, printWriter);
        printWriter.close();
    }
}
