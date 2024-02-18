package com.tc.collabapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Partha Pratim Baral
 * Topic :
 * Date: 2/18/2024
 */

@RestController
@RequestMapping("/v1")
public class CollaborationController {

    private static final Logger logger = LoggerFactory.getLogger(CollaborationController.class);

    @GetMapping("/ping")
    public String pingService() {

        logger.info(" Ping endpoint call");
        return "Collaboration API is Up and running";
    }
}
