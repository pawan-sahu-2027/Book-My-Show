package com.scaler.bookmyshow.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
@Setter
@Getter
public class ApplicationConfiguaration {
    @Bean
    public RestTemplate createRestTemplate(){

        return new RestTemplate();
    }
}
