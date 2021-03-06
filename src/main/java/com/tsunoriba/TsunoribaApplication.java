package com.tsunoriba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TsunoribaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TsunoribaApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TsunoribaApplication.class);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getSomething() {
        return "ツノリバ！<br>GitHub連動！";
    }
}
