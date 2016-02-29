package util;

/**
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
 */
public class NotAPositiveNumberException extends Exception {
    /** Строка с сообщением об ошибке*/
    private static final String ERROR_MESSAGE = "Должно быть положительное значение всех чисел";

    /** Вызывает сообщение об ошибке*/
    public NotAPositiveNumberException(){
        super(ERROR_MESSAGE);
    }
}