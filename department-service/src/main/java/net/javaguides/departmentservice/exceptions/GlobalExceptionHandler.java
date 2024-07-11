//package net.javaguides.departmentservice.exceptions;
//
//import java.time.LocalDateTime;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
//	
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ErrorDetails> handleResouceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
//		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
//				exception.getMessage(), 
//				webRequest.getDescription(false), 
//				"DEPARTMENT NOT FOUND");
//	
//		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
//	}
//	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorDetails> handleResouceNotFoundException(Exception exception, WebRequest webRequest){
//		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
//				exception.getMessage(), 
//				webRequest.getDescription(false), 
//				"INTERNAL SERVER ERROR");
//	
//		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
//	}
//
//}
