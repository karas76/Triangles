package util;

/**
 * �������� ������: ���������� �� ������, ����� ������ � ����� �� ��������� ������
 * @author ������� �����.
 * ������: ���-42��.
 */
public class IncorrectDataException extends Exception{

        /** ������ � ���������� �� ������*/
        private static final String ERROR_MESSAGE = "Incorrect data";

        /** �������� ��������� �� ������*/
        public IncorrectDataException(){
            super(ERROR_MESSAGE);
        }
}
