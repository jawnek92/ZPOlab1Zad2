package com.jawnek;

public class Main {

    public static void main(String[] args) {

        TestNRB test1 = new TestNRB(new StringBuffer("68114020170000460212851536"));
        test1.runTest();

        TestNRB test2 = new TestNRB(new StringBuffer("68114020170000460210051536"));
        test2.runTest();

    }
}
