package ferrari_authorised_dealer.api.controller;

import ferrari_authorised_dealer.business.EntityStateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityStateException.class)
    protected ResponseEntity<?> handleNotUnique(Exception e, WebRequest r) {
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    //NoSuchElementException
}
