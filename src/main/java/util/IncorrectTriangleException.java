package util;

/**
 * Created by Roman on 12.02.2016.
 */
public class IncorrectTriangleException extends Exception {
        /** Строка с сообщением об ошибке*/
        private static final String ERROR_MESSAGE = "Некорректный треугольник";

        /** Вызывает сообщение об ошибке*/
        public IncorrectTriangleException() {
            super(ERROR_MESSAGE);
        }

}
