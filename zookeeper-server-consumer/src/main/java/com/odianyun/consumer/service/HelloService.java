package com.odianyun.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "server-provider", path = "provider/hello")
public interface HelloService {
    @GetMapping (value = "hello")
    public String hello();
}
