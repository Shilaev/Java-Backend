package shilaev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import shilaev.messageMaker.MessageMaker;
import shilaev.printer.ByePrinter;
import shilaev.printer.HelloPrinter;
import shilaev.printer.Printer;

@Configuration
@ComponentScan("shilaev")
@PropertySource("classpath:/application.properties")
@EnableWebMvc
public class SpringConfiguration implements WebMvcConfigurer {

    private final ApplicationContext applicationContext;

    @Autowired
    public SpringConfiguration(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        registry.viewResolver(resolver);
    }

    @Bean("messageMaker.helloPrinter")
    @Autowired
    public MessageMaker messageMakerHelloPrinter(@Qualifier("helloPrinter") Printer printer) {
        MessageMaker messageMaker = MessageMaker.getMessageMaker(printer);
        return messageMaker;
    }

    @Bean("messageMaker.byePrinter")
    @Autowired
    public MessageMaker messageMakerByePrinter(@Qualifier("byePrinter") Printer printer) {
        MessageMaker messageMaker = MessageMaker.getMessageMaker(printer);
        return messageMaker;
    }

    @Bean("helloPrinter")
    public HelloPrinter helloPrinter() {
        return new HelloPrinter();
    }

    @Bean("byePrinter")
    public ByePrinter byePrinter() {
        return new ByePrinter();
    }
}
