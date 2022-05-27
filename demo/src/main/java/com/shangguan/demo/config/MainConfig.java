package com.shangguan.demo.config;

import com.shangguan.demo.mapper.ArticleMapper;
import com.shangguan.demo.model.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Configuration
//@ComponentScan(value = "com.shangguan.demo" , excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class})
//})
@ComponentScan(value = "com.shangguan.demo" , includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {ArticleMapper.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterType.class})

},useDefaultFilters = false)
public class MainConfig {
    @Bean
    public Article article(){
        return new Article("活着",89L);
    }
}
