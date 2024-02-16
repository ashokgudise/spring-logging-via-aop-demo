package com.ashok.logging.demo.service;

import com.ashok.logging.demo.logging.StopWatcher;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @StopWatcher
    public void databaseServiceCall()  {
        try {
            Thread.sleep(2000); // Simulating device call with 1-second sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
