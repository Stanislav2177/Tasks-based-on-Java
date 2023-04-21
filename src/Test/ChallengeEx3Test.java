package Test;

import ChallengeEx3.RabbitThief;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChallengeEx3Test {

    int[][] garden1 = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}};

    int[][] garden2 = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}};

    int[][] garden3 = {{1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1}};

    RabbitThief rabbitThief = new RabbitThief();

    @Test
    void testGarden1(){
        int i = rabbitThief.checkArray(garden1);
        assertEquals(2,i );
    }

    @Test
    void testGarden2(){
        int i = rabbitThief.checkArray(garden2);
        assertEquals(1,i );
    }

    @Test
    void testGarden3(){
        int i = rabbitThief.checkArray(garden3);
        assertEquals(3, i);
    }
}
