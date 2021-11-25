package ferrariAuthorisedDealer.api.controller;

import ferrariAuthorisedDealer.business.EntityStateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityStateException.class)
    protected ResponseEntity<?> handleNotUnique(Exception e, WebRequest r) {
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    //NoSuchElementException
}
