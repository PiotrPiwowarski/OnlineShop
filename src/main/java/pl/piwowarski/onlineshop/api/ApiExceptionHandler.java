package pl.piwowarski.onlineshop.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import pl.piwowarski.onlineshop.constant.ExceptionMessages;
import pl.piwowarski.onlineshop.exception.NoItemsWithSuchIdException;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(NoItemsWithSuchIdException.class)
    public ResponseEntity<String> handleException() {
        return new ResponseEntity<>(ExceptionMessages.NO_ITEM_WITH_SUCH_ID_EXCEPTION_MESSAGE, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleException(MethodArgumentTypeMismatchException e) {
        return new ResponseEntity<>(ExceptionMessages.WRONG_ITEM_TYPE_EXCEPTION_MESSAGE, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
