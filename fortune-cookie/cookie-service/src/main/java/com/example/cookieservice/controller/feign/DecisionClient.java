package com.example.cookieservice.controller.feign;

import message.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="DECISION-SERVICE")
public interface DecisionClient {
    @GetMapping("/decision")
    Message getMsg();

}
