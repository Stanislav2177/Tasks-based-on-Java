package ChallengeEx3;

public class RabbitThief {
    //Once upon a time there was a rabbit who loved to steal carrots from the gardens of
    // the good software developers. Every time he leaped in a garden, he wanted to collect all
    // the carrots. Can you help the rabbit find how many times he has to jump to eat all the carrots?
    // The gardens are always square, he always enters from the top left corner and he has to jump once
    // for one group of carrots that have no space between each other vertically or horizontally


    public static void main(String[] args) {
        int[][] array = {{1, 1, 0, 0, 0},
                         {1, 1, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 0, 1, 1},
                         {0, 0, 0, 1, 1}};

        int fill = 0;

        printArray(array);
        int jumps = checkArray(array);

    }

    //TODO: IMPLEMENT GRAPH

    private static int checkArray(int[][] array) {
        //check for spaces between numbers

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if(array[row][col] != array[row][col+1]){

                }
            }
        }
        
        
        

        return 0;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}