package com.roomate.rest;

import com.roomate.config.JerseyConfig;
import com.roomate.config.TestConfig;

import org.glassfish.jersey.test.JerseyTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;

import static org.assertj.core.api.Assertions.assertThat;


public class RestResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        return new JerseyConfig()
                .property("contextConfig", context);
    }

}
