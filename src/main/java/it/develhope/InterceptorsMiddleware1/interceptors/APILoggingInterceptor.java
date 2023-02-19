package it.develhope.InterceptorsMiddleware1.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author Drumstyle92
 * Interceptor class on Basic controller API requests that implements one
 * or more methods defined by an interface of type HandlerInterceptor such
 * that it can provide logging, authentication, authorization,
 * caching, error handling, and other common functionality.
 */
@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    /**
     * @param request Parameter that allows you to manage the information of the API request
     * @param response Parameter that allows you to manage the information of the API response
     * @param handler Parameter where passes an object containing the component that manages the HTTP request
     * @return The user header is printed again
     * @throws Exception raises a generic exception and sends it back to the caller
     * Method taken from the implemented interface that allows to check the call before the request
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("User Agent header: " + request.getHeader("User-Agent"));
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }


}
