package util;

/**
 * @author ������� �����.
 * ������: ���-42��.
 */
public class IncorrectDataException extends Exception{

        /** ������ � ���������� �� ������*/
        private static final String ERROR_MESSAGE = "sample";

        /** �������� ��������� �� ������*/
        public IncorrectDataException(){
            super(ERROR_MESSAGE);
        }
}
