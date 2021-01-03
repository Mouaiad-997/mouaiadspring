package com.mouaiadspring.mouaiadspring.service;

import com.mouaiadspring.mouaiadspring.model.DataEntity;
import com.mouaiadspring.mouaiadspring.repositories.DataRepository;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ScraperService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    DataRepository repository;

    private Document getDocument(String url) {
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        Document parse = Jsoup.parse(response.getBody());
        return parse;
    }

    public DataEntity fetchData(String url) {
        Document document = getDocument(url);
        String title = document.getElementsByTag("title").get(0).text();
        String body = document.getElementsByTag("body").text();
        DataEntity dataEntity = new DataEntity();
        dataEntity.setBody(body)
                .setTitle(title);
        repository.save(dataEntity);
        System.out.println(dataEntity);
        return dataEntity;
    }

}
