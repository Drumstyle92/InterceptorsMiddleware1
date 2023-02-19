package it.develhope.InterceptorsMiddleware1.configurations;

import it.develhope.InterceptorsMiddleware1.interceptors.APILoggingInterceptor;
import it.develhope.InterceptorsMiddleware1.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Drumstyle92
 * Class with configuration for interceptor
 */
@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    /**
     * Automated dependency injection on the APILoggingInterceptor class
     */
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    /**
     * Automated dependency injection on the LegacyInterceptor class
     */
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    /**
     * @param registry Parameter where the used interceptors will be recorded
     * Method where all the interceptors to be used in the program are inserted
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);

    }

}
