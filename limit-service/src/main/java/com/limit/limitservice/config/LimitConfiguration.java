package com.limit.limitservice.config;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
    private int minimum;

    public LimitConfiguration() {
    }

    private int maximum;


    public LimitConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
