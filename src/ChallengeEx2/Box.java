package ChallengeEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Box {
    // In a box, there's a different count of balls in different colors, which we receive as an input in the following
    // format: "Color: count", until we receive an "End" command. After that, we are allowed to remove balls from that box,
    // but we can't look at their color. We need to write a program
    // that prints the smallest count of balls we must take out, so we are sure there is only one color left in the box.


    public static void main(String[] args) {
        List<Ball> ballList = new ArrayList<>();
        Ball ball = new Ball();

        ballList = ballsInput();


        List<Ball> listDesc = getRemainingBalls(ballList);

        System.out.println("Colours with smallest count of balls : "+ listDesc);

        ball = getBallsCountDescending(ballList).get(0);

        System.out.println("Colour with the biggest count of balls: " + ball.toString());
    }

    public static List<Ball> getRemainingBalls(List<Ball> ballList){
        ballList = getBallsCountDescending(ballList);
        ballList.remove(0);
        return ballList;
    }

    public static List<Ball> ballsInput() {
        List<Ball> ballList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        int commandLength = sb.length();

        sb.delete(commandLength - 4, commandLength);

        ballList = separateTheInput(input);

        return ballList;
    }

    public static List<Ball> separateTheInput(String input) {
        List<Ball> ballList = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\w+):\\s*(\\d+)");
        Matcher matcher = pattern.matcher(input);

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            String color = matcher.group(1);
            int count = Integer.parseInt(matcher.group(2));

            Ball ball = new Ball(color, count);
            ballList.add(ball);

            if (output.length() > 0) {
                output.append(", ");
            }
            output.append(color).append(": ").append(count);
        }

        System.out.println("Balls: " + ballList);
        return ballList;
    }

    private static List<Ball> getBallsCountDescending(List<Ball> ballList) {
        return ballList.stream()
                .sorted((b1, b2) -> Integer.compare(b2.getCount(), b1.getCount()))
                .collect(Collectors.toList());
    }

}
