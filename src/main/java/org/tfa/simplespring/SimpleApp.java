package org.tfa.simplespring;

//import javax.security.auth.message.config.AuthConfigFactory;
//import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@SpringBootApplication
public class SimpleApp extends SpringBootServletInitializer {

	static final Logger LOG = LoggerFactory.getLogger(SimpleApp.class);
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	
    	//if (AuthConfigFactory.getFactory() == null) {
        //    AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
    	//}
    	return application.sources(SimpleApp.class);
    }

    public static void main(String[] args) throws Exception {
    	
    	//if (AuthConfigFactory.getFactory() == null) {
        //    AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
        //}
    	
        SpringApplication.run(SimpleApp.class, args);
    }
 
    @RequestMapping("/")
    String home() {
        System.out.println("/ called, returning Hello World");
        LOG.debug("/ called, returning Hello World");
        return "resourve '/' - Hello World!";
    }

    @RequestMapping("/index")
    String index() {
        System.out.println("index called, returning index");
        LOG.debug("index called, returning index");
        return "resource 'index' returned";
    }

}