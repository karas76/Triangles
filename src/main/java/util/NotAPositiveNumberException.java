package util;

/**
 * @author ������� �����.
 * ������: ���-42��.
 */
public class NotAPositiveNumberException extends Exception {
    /** ������ � ���������� �� ������*/
    private static final String ERROR_MESSAGE = "������ ���� ������������� �������� ���� �����";

    /** �������� ��������� �� ������*/
    public NotAPositiveNumberException(){
        super(ERROR_MESSAGE);
    }
}