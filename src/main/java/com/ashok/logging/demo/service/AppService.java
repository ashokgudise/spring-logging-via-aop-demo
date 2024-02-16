package com.ashok.logging.demo.service;

import com.ashok.logging.demo.logging.StopWatcher;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private DatabaseService databaseService;

    public AppService(DatabaseService databaseService){
        this.databaseService = databaseService;
    }

    @StopWatcher
    public void appServiceCall()  {
        try {
            Thread.sleep(1000); // Simulating device call with 1-second sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.databaseService.databaseServiceCall();
    }
}
