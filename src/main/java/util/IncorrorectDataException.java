package util;

/**
 * @author ������� �����.
 * ������: ���-42��.
 */
public class IncorrorectDataException extends Exception{

        /** String with error message. */
        private static final String ERROR_MESSAGE = "������������ ���������� �����";

        /**
         * Default constructor.
         * Sets exception message.
         */
        public IncorrorectDataException(){
            super(ERROR_MESSAGE);
        }
}
