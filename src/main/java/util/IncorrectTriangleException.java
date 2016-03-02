package util;


        /**
        * Описание класса: Информация об ошибке, когда треугольник не может существовать
        * @author Карасев Роман
        * Группа: ИВТ-42БО
        */
public class IncorrectTriangleException extends Exception {
        /** Строка с сообщением об ошибке*/
        private static final String ERROR_MESSAGE = "Некорректный треугольник";

        /** Вызывает сообщение об ошибке*/
        public IncorrectTriangleException() {
            super(ERROR_MESSAGE);
        }

}
