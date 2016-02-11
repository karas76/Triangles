package util;

/**
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
 */
public class NotAPositiveNumberException extends Exception {
    /** String with error message.*/
    private static final String ERROR_MESSAGE = "Должно быть положительное значение всех чисел";

    /**
     * Default constructor.
     * Sets exception message.
     */
    public NotAPositiveNumberException(){
        super(ERROR_MESSAGE);
    }
}