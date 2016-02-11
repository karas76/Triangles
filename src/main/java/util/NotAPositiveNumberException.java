package util;

/**
 * @author ������� �����.
 * ������: ���-42��.
 */
public class NotAPositiveNumberException extends Exception {
    /** String with error message.*/
    private static final String ERROR_MESSAGE = "������ ���� ������������� �������� ���� �����";

    /**
     * Default constructor.
     * Sets exception message.
     */
    public NotAPositiveNumberException(){
        super(ERROR_MESSAGE);
    }
}