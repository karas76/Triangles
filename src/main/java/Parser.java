import java.util.*;

public class Parser {
    private List<Triangle> listTriangles = new ArrayList<Triangle>();

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
    /** �������� ���������� ����������� �� �����. */
    /**
     *
     * @param list ������ �����.
     * @return
     * @throws Exception
     */
    public static int getSumTr(List<String> list) throws Exception{
        int k = 0;
        String parts[];
        String string;
            string = list.get(0);
            parts = string.split(" ");
            k = Integer.parseInt(parts[0]);
        return k;
    }
    /** ������� ������ ������������� �� �����. */
    /**
     * ������� ������ ������������� �� �����.
     * @param list ������ �����.
     * @param amount ���������� �������������
     * @return
     */
    public static List<Triangle> calculateListTr(List<String> list, int amount) throws Exception{
        String parts[];
        String string;
        double side[] = new double[3];
        List<Triangle> listTriangles = new ArrayList<Triangle>();
        for (int j = 1; j < amount + 1; j++) {
            string = list.get(j);
            parts = string.split("\\s+");
            for (int i = 0; i < 3; i++) {
                side[i] =  Double.parseDouble(parts[i]);
            }
            listTriangles.add(new Triangle(side[0], side[1], side[2]));
        }
        return listTriangles;
    }

}
