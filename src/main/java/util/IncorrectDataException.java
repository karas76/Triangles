package util;

/**
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
 */
public class IncorrectDataException extends Exception{

        /** String with error message. */
        private static final String ERROR_MESSAGE = "sample";

        /**
         * Default constructor.
         * Sets exception message.
         */
        public IncorrectDataException(){
            super(ERROR_MESSAGE);
        }
}
