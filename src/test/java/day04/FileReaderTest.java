package day04;

import day05.FileReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void TestFileReader(){
        day05.FileReader fileReader=new FileReader();;
        assertEquals(14,fileReader.findSmallestTemperatureSpread());
    }
}