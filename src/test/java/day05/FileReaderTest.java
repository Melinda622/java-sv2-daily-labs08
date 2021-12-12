package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void TestFileReader(){
        FileReader fileReader=new FileReader();;
        assertEquals(14,fileReader.findSmallestTemperatureSpread());
    }

}