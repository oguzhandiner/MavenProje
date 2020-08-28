package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setup() {
        System.out.println("setup calisti");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("tearDown calisti");}

        @Before
        public void methodOnce () {
            System.out.println("Method'dan once calisti");
        }

        @After
        public void tearDown1 () {
            System.out.println("tearDown1 Method calisti.");
        }
        @Test
        public void test01 () {
            System.out.println("test01 calisti.");
        }
        @Test
        public void test02 () {
            System.out.println("test02 calisti.");
        }
    }
