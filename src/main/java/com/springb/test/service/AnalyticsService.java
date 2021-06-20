package com.springb.test.service;


import com.springb.test.Model.BookAnalytics;
import com.springb.test.Model.BookanalyticsRepository;
import com.springb.test.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class AnalyticsService {


    @Autowired
    private BookanalyticsRepository bookanalyticsRepository;

    @Autowired
    private Bookservice bookservice;

  public void analyseandupdate(Integer id,String type,int cost)
  {
       // boolean exists=bookanalyticsRepository.exists(id);
    // Optional<BookAnalytics> Analytics=bookanalyticsRepository.findById(type);
      long counts=bookanalyticsRepository.count(id);

        if(counts==0)
        {
            BookAnalytics bookAnalytics=new BookAnalytics();
            bookAnalytics.setCount(1);
            bookAnalytics.setBookcost(cost);
            bookAnalytics.setBooktype(type);
            bookAnalytics.setId(id);

            bookanalyticsRepository.save(bookAnalytics);
        }
        else {

            int enhancement;
            BookAnalytics bookAnalytics = bookanalyticsRepository.findById(id);

            int count = bookAnalytics.getCount();
            count++;
            System.out.println(count);
            bookAnalytics.setCount(count);
            bookanalyticsRepository.save(bookAnalytics);

        }
  }


}
