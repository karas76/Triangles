package util;

/**
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
 */
public class IncorrorectDataException extends Exception{

        /** String with error message. */
        private static final String ERROR_MESSAGE = "Некорректное количество чисел";

        /**
         * Default constructor.
         * Sets exception message.
         */
        public IncorrorectDataException(){
            super(ERROR_MESSAGE);
        }
}
