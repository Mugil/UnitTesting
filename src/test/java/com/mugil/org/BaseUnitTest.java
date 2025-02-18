package com.mugil.org;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

public class BaseUnitTest {
    long startTime;
    long endTime;

    @BeforeEach
    public void recordStartTime() {
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    public void recordEndAndExecutionTime() {
        endTime = System.currentTimeMillis();
        System.out.println("Last testcase exection time in millisecond : " +  TimeUnit.NANOSECONDS.toMicros((endTime - startTime)) + " Seconds");
    }
}
