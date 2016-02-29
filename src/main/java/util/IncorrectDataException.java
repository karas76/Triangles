package util;

/**
 * Описание класса: Информация об ошибке, когда данные в файле не правильно заданы
 * @author Карасев Роман.
 * Группа: ИВТ-42БО.
 */
public class IncorrectDataException extends Exception{

        /** Строка с сообщением об ошибке*/
        private static final String ERROR_MESSAGE = "Incorrect data";

        /** Вызывает сообщение об ошибке*/
        public IncorrectDataException(){
            super(ERROR_MESSAGE);
        }
}
