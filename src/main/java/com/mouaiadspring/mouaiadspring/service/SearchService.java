package com.mouaiadspring.mouaiadspring.service;

import com.mouaiadspring.mouaiadspring.repositories.DataRepository;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    private DataRepository dataRepository;
    public Object searchData(String title) {
        return dataRepository.findAllBytitle(title);
    }
}
