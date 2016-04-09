/*
 *
 */

package ${package}.exception;

import ${package}.exception.handling.ErrorCode;
import org.springframework.http.HttpStatus;

/**
 * @author Mels
 */
public class UnknownException extends RuntimeException {

    private HttpStatus httpStatus;

    private ErrorCode errorCode;

    private Exception ex;

    public UnknownException(HttpStatus httpStatus, ErrorCode errorCode, Exception ex) {
        super(ex);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.ex = ex;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Exception getException() {
        return ex;
    }
}
