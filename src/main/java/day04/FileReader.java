package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> readWeather() {

        List<String> weather = new ArrayList<>();
        Path path = Paths.get("src/main/resources/Weather.txt");

        try {
            weather = Files.readAllLines(path);
            return weather;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return weather;
    }

    public List<String> transformWeather() {

        List<String> formattedWeather = new ArrayList<>();

        for (int i = 2; i < readWeather().size() - 1; i++) {
            formattedWeather.add(readWeather().get(i));
        }
        return formattedWeather;
    }

    public int findSmallestTemperatureSpread() {

        int minDay = 0;

        int minDifference = 1000;

        for (String s : transformWeather()) {
            int day = Integer.parseInt(s.substring(2, 4).trim());
            int maxTemperature = Integer.parseInt(s.substring(6, 8).trim());
            int minTemperature = Integer.parseInt(s.substring(12, 14).trim());
            int difference = maxTemperature - minTemperature;

            if (difference < minDifference) {
                minDifference = difference;
                minDay = day;
            }
        }
        return minDay;
    }
}
