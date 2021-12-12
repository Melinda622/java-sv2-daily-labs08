package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoccerTest {

    @Test
    void TestSoccer(){
        Soccer soccer=new Soccer();
        assertEquals("Aston_Villa",soccer.findSmallestDifference());
    }
}