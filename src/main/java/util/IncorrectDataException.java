package util;

/**
 * @author ������� �����.
 * ������: ���-42��.
 */
public class IncorrectDataException extends Exception{

        /** String with error message. */
        private static final String ERROR_MESSAGE = "������������ ���������� �����";

        /**
         * Default constructor.
         * Sets exception message.
         */
        public IncorrectDataException(){
            super(ERROR_MESSAGE);
        }
}
