package util;

/**
 * Created by Roman on 12.02.2016.
 */
public class IncorrectTriangleException extends Exception {
        /** ������ � ���������� �� ������*/
        private static final String ERROR_MESSAGE = "������������ �����������";

        /** �������� ��������� �� ������*/
        public IncorrectTriangleException() {
            super(ERROR_MESSAGE);
        }

}
