package com.shangguan.demo;

import com.shangguan.demo.config.MainConfig;
import com.shangguan.demo.config.MainConfig2;
import com.shangguan.demo.model.Article;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {


    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Article article = (Article) annotationConfigApplicationContext.getBean("article");
        System.out.println(article);
    }

    @Test
    public void testComponent(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Article article = (Article) annotationConfigApplicationContext.getBean("article");
//        System.out.println(article);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void testScopeAndLazy(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc启动");
        Article article1 = (Article) annotationConfigApplicationContext.getBean("article");
        Article article2 = (Article) annotationConfigApplicationContext.getBean("article");
        System.out.println(article1 == article2);
    }

}
