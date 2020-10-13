package com.limit.limitservice.controller;

import com.limit.limitservice.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limit")
    public LimitConfiguration getConfiguration() {
        return new LimitConfiguration(limitConfiguration.getMinimum(), limitConfiguration.getMaximum());
    }
}
