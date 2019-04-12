package com.in28minutes.rest.webservices.restfulwebservices;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Set<VendorExtension> ve= new HashSet<VendorExtension>(1);
    public static final Contact DEFAULT_CONTACT = new Contact("Yusuf Incekara", "http://www.mikrokom.com", "yincekara@mikrokom.com");
    //public static final ApiInfo DEFAULT_API_INFO = new ApiInfo( "Title","Description","Version","Terms of service","Yusuf Incekara","licence","licenceurl");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo( "Title","Description","Version","Terms of service",
            DEFAULT_CONTACT ,"licence","licenceurl",ve);

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
    }

}
