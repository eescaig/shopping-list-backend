package es.santescas.shoppingList.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mongodb.DuplicateKeyException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ DuplicateKeyException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void resolveException(RuntimeException re) {
		re.printStackTrace();
	}
}
