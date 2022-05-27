package com.shangguan.demo.config;

import com.shangguan.demo.model.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {
//    @Scope(value = "prototype")
    @Lazy
    @Bean
    public Article article() {
        System.out.println("给容器中添加bean");
        return new Article("红岩", 100L);
    }
}
