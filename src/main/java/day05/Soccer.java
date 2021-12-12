package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Soccer {

    public List<String> readFootball() {

        List<String> football = new ArrayList<>();
        Path path = Paths.get("src/main/resources/Football.txt");

        try {
            football = Files.readAllLines(path);
            return football;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return football;
    }


    public List<String> transformFootball() {

        List<String> formattedFootball = new ArrayList<>();

        for (int i = 1; i < 18; i++) {
            formattedFootball.add(readFootball().get(i));
        }

        for (int i = 19; i < readFootball().size(); i++) {
            formattedFootball.add(readFootball().get(i));
        }

        return formattedFootball;
    }

    private int getDifference(int number1,int number2){
        return number1-number2;
    }

    public String findSmallestDifference() {

        int scoredGoals = Integer.parseInt(transformFootball().get(0).substring(42, 45).trim());

        int receivedGoals = Integer.parseInt(transformFootball().get(0).substring(49, 52).trim());

        String minTeam = "";

        int minDifference = 1000;

        for (String s : transformFootball()) {
            String team = s.substring(6, 18).trim();
            scoredGoals = Integer.parseInt(s.substring(42, 45).trim());
            receivedGoals = Integer.parseInt(s.substring(49, 52).trim());
            int difference = Math.abs(getDifference(scoredGoals,receivedGoals));

            if (difference < minDifference) {
                minDifference = difference;
                minTeam = team;
            }
        }
        return minTeam;
    }
}
