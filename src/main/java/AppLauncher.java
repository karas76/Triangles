import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Roman on 10.10.2015.
 */
public class AppLauncher {
    private List<Triangle> listTriangles = new ArrayList<Triangle>();
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
            if (e instanceof  NumberFormatException) {
                catchNumberFormatException((NumberFormatException) e);
            }
            if (e instanceof NullPointerException){
                catchNullPointerException();
            }
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
    public static void printHelp(){

    }

    /** String with wrong input file error message. */
    public static final String WRONG_INPUT_FILE = "Wrong format of the input file.";

    private static void catchNumberFormatException(NumberFormatException e) {
        System.out.println(e.getMessage());
        System.out.println(WRONG_INPUT_FILE);
        AppLauncher.printHelp();
        System.exit(0);
    }
    private static void catchNullPointerException() {
        System.out.println(WRONG_INPUT_FILE);
        AppLauncher.printHelp();
        System.exit(0);
    }

}
