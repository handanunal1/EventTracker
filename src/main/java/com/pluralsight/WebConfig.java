package com.pluralsight;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration    /*We don't need a web xml,create a servlet.. Spring automatically creates context*/
@EnableWebMvc
public class WebConfig {

}