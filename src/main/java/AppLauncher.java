import java.util.*;

/**
 * Имя проекта: Треугольники на плоскости
 * Описание: Программа считывает данные из входного файла
 *                       создаёт список треугольников и считает
 *                       их площадь и периметр
 *                       и записывает результат в файл или консоль.
 * @author Карасев Роман
 * Group: ИВТ-42БО
 */
public class AppLauncher {
    /** Создаёт пустой список треугольников*/
    private List<Triangle> listTriangles = new ArrayList<Triangle>();

    /**
     * Считывает имя входного и выходного файла, в случае ошибки показывает инструкцию
     * @param args строки с именами файлов
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        try {
            switch (args.length) {
                case 1:
                    new AppLauncher(args[0]);
                    break;
                case 2:
                    new AppLauncher(args[0], args[1]);
                    break;
                default:
                    printHelp();
                    return;
            }
        }catch (Exception e) {
            handleExceptions(e);
        }
    }
    /** Задан входной и выходной файл*/
   AppLauncher(String inputFile, String outputFile) throws Exception{
       Parser parser = new Parser(IOStreamer.inFile(inputFile));
       listTriangles = parser.getListTriangles();
       WorkWithTriangles.sortTriangles(listTriangles);
       IOStreamer.printToFile(outputFile, listTriangles);
    }

    /** Задан входной файл*/
    AppLauncher(String inputFile) throws Exception{
        Parser parser = new Parser(IOStreamer.inFile(inputFile));
        listTriangles = parser.getListTriangles();
        WorkWithTriangles.sortTriangles(listTriangles);;
        IOStreamer.printToConsole(listTriangles);
    }

    /** Показывает инструкцию*/
    public static void printHelp(){
        System.out.print("============Помощь============\n  Программа считывает список треугольников и выдаёт их площади по возрастанию. " +
                "В качестве параметров подаётся имя входного файла и результирующего файла. " +
                "Если имя результирующего файла не указано, то результат запишется в консоль." +
                "  Содержание входного файла: На первой строке подаётся количество треугольников. На следующих строках подаётся 3 числа -" +
                " длины сторон.");
    }

    /**
     * Показывает ошибку, вызывает инструкцию, прекращает работу программы
     * @param e
     */
    private static void handleExceptions(Exception e) {
        System.out.println(e.getMessage());
        AppLauncher.printHelp();
        System.exit(0);
    }
}
