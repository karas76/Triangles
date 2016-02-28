package util;

/**
 * Created by Roman on 12.02.2016.
 */
public class IncorrectTriangleException extends Exception {
        /** String with error message. */
        private static final String ERROR_MESSAGE = "������������ �����������";

        /**
         * Default constructor.
         * Sets exception message.
         */
        public IncorrectTriangleException() {
            super(ERROR_MESSAGE);
        }

}
