package com.demoqa.automation.utils;

import java.io.InterruptedIOException;

public class Times {
    public static void waitFor( int millis) throws InterruptedException{
        Thread.sleep(millis);
    }
}
