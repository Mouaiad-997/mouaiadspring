package com.mouaiadspring.mouaiadspring.controllers;

import com.mouaiadspring.mouaiadspring.model.DataEntity;
import com.mouaiadspring.mouaiadspring.repositories.DataRepository;
import com.mouaiadspring.mouaiadspring.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/data")
@CrossOrigin
public class DataControllers {

    @Autowired
    private DataRepository datarepository;
    private SearchService searchService;

    @GetMapping("/getdata")
    public List<DataEntity> getAlldata() {
        return datarepository.findAll();
    }


    @PostMapping("/postdata")
    public DataEntity createdata(@RequestBody DataEntity dataEntity) {
        return datarepository.save(dataEntity);


    }


    @GetMapping("/availableData/search")
    public Object searchAvailabledata(@RequestParam("title") String title) {
        return searchService.searchData(title);
    }
}
