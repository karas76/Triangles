package util;


        /**
        * �������� ������: ���������� �� ������, ����� ����������� �� ����� ������������
        * @author ������� �����
        * ������: ���-42��
        */
public class IncorrectTriangleException extends Exception {
        /** ������ � ���������� �� ������*/
        private static final String ERROR_MESSAGE = "������������ �����������";

        /** �������� ��������� �� ������*/
        public IncorrectTriangleException() {
            super(ERROR_MESSAGE);
        }

}
