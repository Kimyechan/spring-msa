package com.example.msanewsservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @RequestMapping("/news/test")
    public String getNews() {
        return "news Information";
    }
}
