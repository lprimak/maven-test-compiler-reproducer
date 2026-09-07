package com.flowlogix.maven.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyTestNGExtension implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("MyTestNGExtension: onStart called for suite: " + suite.getName());
        if (Boolean.getBoolean("exceptionFromTestNG")) {
            throw new RuntimeException("MyTestNGExtension: onStart called for suite: " + suite.getName());
        }
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("MyTestNGExtension: onFinish called for suite: " + suite.getName());
    }
}
