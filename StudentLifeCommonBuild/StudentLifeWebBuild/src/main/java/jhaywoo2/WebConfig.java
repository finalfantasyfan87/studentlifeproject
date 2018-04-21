package jhaywoo2;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan({"jhaywoo2.depaul.studentlife"})
public class WebConfig extends WebMvcConfigurerAdapter{

    @Bean
    InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver myViewResolver = new InternalResourceViewResolver();
        myViewResolver.setViewClass(JstlView.class);
        myViewResolver.setPrefix("/WEB-INF/views/");
        myViewResolver.setSuffix(".jsp");
        return  myViewResolver;
    }

    @Bean
    MessageSource messageSource(){
        ResourceBundleMessageSource myMessageSource = new ResourceBundleMessageSource();
        myMessageSource.setBasename("messages");
        return myMessageSource;
    }
    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean myValidator = new LocalValidatorFactoryBean();
        myValidator.setValidationMessageSource(messageSource());
        return myValidator;
    }
}