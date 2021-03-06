package self.aub.product.cgt.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;


/**
 * 用于全局异常处理<br/>
 * 1.BasicBizException, 基础的业务异常, 返回相应的错误码及描述; 例如: 注册业务, 01:用户已存在, 02:验证码错误<br/>
 * 2.IllegalArgumentException, 参数异常, 客户端调用错误<br/>
 * 3.Exception, 未知异常, 服务端错误<br/>
 */
@ControllerAdvice
public class RestfulControllerAdvice {

    private static final Logger LOG = LogManager.getLogger(RestfulControllerAdvice.class);

    @ExceptionHandler(BasicBizException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public RestfulResult handleBasicBizException(HttpServletRequest request, Exception exception) {
        BasicBizException basicBizException = (BasicBizException) exception;
        BasicBizDto basicBizDto = new BasicBizDto(basicBizException.getBizCode(), basicBizException.getMessage());
        return new RestfulResult(basicBizDto);
    }

    @ExceptionHandler({IllegalArgumentException.class, ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public RestfulResult handleIllegalArgumentException(HttpServletRequest request, Exception exception) {
        LOG.error("REQ; URL:{}, PARAM:{}, EXC:{}", request.getRequestURI(), request.getParameterMap(), exception.getMessage());
        return new RestfulResult(RestfulStatusEnum.ILLEGAL_ARGUMENT, exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public RestfulResult handleException(HttpServletRequest request, Exception exception) {
        LOG.error("REQ; URL:{}, PARAM:{}, EXC:", request.getRequestURI(), request.getParameterMap(), exception);
        return new RestfulResult(RestfulStatusEnum.SREVER_SIDE_FAIL, exception.getMessage());
    }

}


