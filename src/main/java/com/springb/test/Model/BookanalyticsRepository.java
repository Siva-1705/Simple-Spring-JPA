package com.springb.test.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookanalyticsRepository extends JpaRepository <BookAnalytics ,String> {


   //boolean existsByType(String type);


    @Query(value = "SELECT count(id) FROM BookAnalytics where id = :id")
    public Long count(@Param("id") int id);

    public BookAnalytics findById(int id);

}

