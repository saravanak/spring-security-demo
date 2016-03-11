package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;


//@Configuration
//@EnableGlobalMethodSecurity()
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
    @Autowired
    private AuthenticationManager am;

    @Override
    protected AuthenticationManager authenticationManager() {
        return am;
    }
//        @Override
//        protected MethodSecurityExpressionHandler createExpressionHandler() {
//            // ... create and return custom MethodSecurityExpressionHandler ...
//            return expressionHander;
//        }
}
