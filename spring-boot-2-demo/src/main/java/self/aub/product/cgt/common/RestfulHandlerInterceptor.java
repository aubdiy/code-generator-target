package self.aub.product.cgt.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Restful 拦截器
 */
public class RestfulHandlerInterceptor implements HandlerInterceptor {
    private static final Logger LOG = LogManager.getLogger(RestfulControllerAdvice.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        LOG.debug("REQ; URL:{}, PARAM:{},", httpServletRequest.getRequestURI(), httpServletRequest.getParameterMap());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) {
        // Do nothing.
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // Do nothing.
    }
}
