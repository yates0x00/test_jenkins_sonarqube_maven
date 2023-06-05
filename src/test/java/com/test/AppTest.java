package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        assertTrue( app.sum(1,2) == 3);
    }


}
