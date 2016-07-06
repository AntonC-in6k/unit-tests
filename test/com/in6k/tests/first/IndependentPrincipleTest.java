package com.in6k.tests.first;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IndependentPrincipleTest {

    public int result = 0;

    @Before
    public void setup() throws Exception{
        System.out.println("Result is:"+result);
    }
    @Test
//    @Ignore
    public void test2() throws Exception {
        result += 4;
        assertEquals(4, result);
    }

    @Test

    public void test1() throws Exception {
        result += 2;
        assertEquals(2, result);
    }
}
