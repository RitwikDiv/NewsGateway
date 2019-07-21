package com.ritwikdivakaruni.newsgateway;
import java.io.Serializable;

public class Article implements Serializable{
    private String author;
    private String title;
    private String urlToImage;
    private String publishedAt;
    private int total;
    private int index;
    private String description;
    private String url;


    public Article(String author, String title, String description, String url, String urlToImage, String publishedAt, int total, int index) {
        this.author = author;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.total = total;
        this.index = index+1;
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public int getTotal() {
        return total;
    }

    public int getIndex() {
        return index;
    }
}
