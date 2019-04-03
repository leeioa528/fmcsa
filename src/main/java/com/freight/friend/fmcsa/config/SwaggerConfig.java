package com.freight.friend.fmcsa.config;


import org.apache.http.HttpHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api()
    {
        return new Docket( DocumentationType.SWAGGER_2 )
                .apiInfo( apiInfo() )
                .globalOperationParameters( getGlobalParameters() )
                .select()
                .apis( RequestHandlerSelectors.basePackage( "com.freight.friend.fmcsa.controller" ) )
                .paths( PathSelectors.any() )
                .build();
    }


    @Bean
    public WebMvcConfigurerAdapter forwardToIndex()
    {
        return new WebMvcConfigurerAdapter()
        {
            @Override
            public void addViewControllers( final ViewControllerRegistry registry )
            {
                super.addViewControllers( registry );
                registry.addRedirectViewController( "/", "/swagger-ui.html" );
            }
        };
    }



    private List<Parameter> getGlobalParameters()
    {
        List<Parameter> parameters = new ArrayList<>();
        ParameterBuilder parameterBuilder = new ParameterBuilder();

        parameters.add( parameterBuilder
                .name( HttpHeaders.CONTENT_TYPE )
                .modelRef( new ModelRef( "string" ) )
                .parameterType( "header" )
                .required( false )
                .build() );

        return parameters;
    }


    private ApiInfo apiInfo()
    {
        return new ApiInfo(
                "carrier-service",
                "The carrier registraion service provides an API to read carrier info from FMCSA.",
                "1.0",
                "",
                new Contact( "", "", "" ),
                "",
                "",
                new ArrayList<>()
        );
    }
}
