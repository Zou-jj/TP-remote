package test;


import solution.Solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testSolution {
    private Solution s;

    @Test
    void test1() {
        s = new Solution(0);
        assertEquals(1, s.getSequence());
    }

    @Test
    void test2() {
        s = new Solution(1);
        assertEquals(2, s.getSequence());
    }

    @Test
    void test3() {
        s = new Solution(4);
        assertEquals(6, s.getSequence());
    }

    @Test
    void test4() {
        s = new Solution(100);
        assertEquals(363, s.getSequence());
    }

    @Test
    void test5() {
        s = new Solution(10000);
        assertEquals(534420, s.getSequence());
    }
}
