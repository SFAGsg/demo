package com.shangguan.demo.model;

public class Article {
    private String title;
    private Long price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Article(String title, Long price) {
        this.title = title;
        this.price = price;
    }

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
