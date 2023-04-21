package Test;


import ChallengeEx2.Ball;
import ChallengeEx2.Box;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChallengeEx2Test {
    Box box = new Box();

    @Test
    public void testInput(){
        Ball redBall = new Ball("Red", 54);
        Ball greenBall = new Ball("Green", 54);

        List<Ball> ballList = box.separateTheInput("Red: 54, Green: 54");


        assertEquals("Red", ballList.get(0).getColor());
        assertEquals(54, ballList.get(0).getCount());
        assertEquals("Green", ballList.get(1).getColor());
        assertEquals(54, ballList.get(0).getCount());


    }



}
