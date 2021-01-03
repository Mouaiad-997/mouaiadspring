package com.mouaiadspring.mouaiadspring.repositories;

import com.mouaiadspring.mouaiadspring.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<DataEntity,Long> {
    List<DataEntity> findAllBytitle(String title);
}
