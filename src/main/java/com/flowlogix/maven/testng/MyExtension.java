package com.flowlogix.maven.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyExtension implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("MyExtension: onStart called for suite: " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("MyExtension: onFinish called for suite: " + suite.getName());
    }
}
