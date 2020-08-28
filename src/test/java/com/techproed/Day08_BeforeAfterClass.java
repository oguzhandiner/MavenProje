package com.techproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {

    @BeforeClass
    public static void setup(){
        System.out.println("setup calisti");

    }

    @Test
    public void test01(){
        System.out.println("test01 calisti");
    }


    @Test
    public void test02(){
        System.out.println("test02 calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown() calisti");
    }




}
