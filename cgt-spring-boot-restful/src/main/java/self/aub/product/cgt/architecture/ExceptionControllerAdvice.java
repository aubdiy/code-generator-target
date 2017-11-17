package self.aub.product.cgt.architecture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liujinxin on 2017/4/28.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    private static final Logger LOG = LogManager.getLogger( ExceptionControllerAdvice.class );

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public RestfulResult handleSQLException(HttpServletRequest request, Exception exception) {
        RestfulResultStatusEnum status;
        if (exception instanceof IllegalArgumentException) {
            status = RestfulResultStatusEnum.ILLEG_ALARGUMENT;
        } else {
            status = RestfulResultStatusEnum.FAIL;
        }
        return new RestfulResult( status, exception.getMessage() );
    }
}
