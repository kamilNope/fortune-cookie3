package com.example.cookieservice;

import com.example.cookieservice.controller.feign.ActivityClient;
import com.example.cookieservice.controller.feign.DecisionClient;
import message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {

    private final ActivityClient activity;
    private final DecisionClient decision;
    @Value("${spring.application.name}")
    private String serviceName;



    public CookieController(ActivityClient activity, DecisionClient decision) {
        this.activity = activity;
        this.decision = decision;
    }

    private Message getMEssage() {
        return getFortune();
    }

    @GetMapping("/fortune")
    public Message fortune(){
        return getMEssage();
    }

    private Message getFortune() {
        return new Message(serviceName.toUpperCase(), decision.getMsg().getMessage() + " " +
                activity.getMsg().getMessage());
    }


}