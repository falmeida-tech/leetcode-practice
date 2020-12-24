package com.falmeida.tech;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeetCodeOddNumberTest {
    private LeetCodeOddNumber solution;

    @BeforeTest
    public void setUp() {
        solution = new LeetCodeOddNumber();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object [][] {
                new Object [] { new int [] { 9, 3, 9, 3, 9, 7, 9 },  7 },
                new Object [] { new int [] { 1, 2, 1, 3, 5, 2, 3 },  5 },

                //double pair matching
                new Object [] { new int [] { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 },  5 },

                //large numbers
                new Object [] { new int [] { 1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000 },  5000000 },
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution(int [] pA, int pExpectedNonPair) {
        Assert.assertEquals(solution.solution(pA), pExpectedNonPair);
    }
}
