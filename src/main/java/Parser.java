import java.util.*;
import util.*;
public class Parser {
    private List<Triangle> listTriangles = new ArrayList<>();

    public int getAmountTriangles() {
        return amountTriangles;
    }

    public List<Triangle> getListTriangles() {

        return listTriangles;
    }

    int amountTriangles;

    Parser(List<String> buffer) throws Exception{
            amountTriangles = getSumTr(buffer);
            listTriangles = calculateListTr(buffer, amountTriangles);
    }
    /** Получает количество треульников из файла. */
    /**
     *
     * @param list список строк.
     * @return
     * @throws Exception
     */
    public int getSumTr(List<String> list) throws Exception{
        int amount = Integer.valueOf(list.get(0).trim().replace("\\s+", " "));
        if (amount > 0){
            return amount;
        }else{
            throw new NotAPositiveNumberException();
        }
    }
    /** Получет список треугольников из файла. */
    /**
     * Получет список треугольников из файла.
     * @param list список строк.
     * @param amount количество треугольников
     * @return
     */
    public List<Triangle> calculateListTr(List<String> list, int amount) throws Exception{
        String parts[];
        String str;
        double side[] = new double[3];
        List<Triangle> listTriangles = new ArrayList<>();
        if (list.size() != amount + 1) {
            throw new IncorrectDataException();
        }
        for (int j = 1; j < amount + 1; j++) {
            str = list.get(j);
            str = removeExtraSpaces(str);
            parts = str.split("\\s+");
            if (parts.length != 3) {
                throw new IncorrectDataException();
            }
            for (int i = 0; i < 3; i++) {
                side[i] =  Double.parseDouble(parts[i]);
            }
            listTriangles.add(new Triangle(side[0], side[1], side[2]));
        }
        return listTriangles;
    }
    /**
     * Remove extra spaces
     * from source string
     */
    private String removeExtraSpaces(String line){
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(line.trim().replaceAll("\\s+", " "));
            stringBuilder.append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
