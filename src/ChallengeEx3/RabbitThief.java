package ChallengeEx3;

public class RabbitThief {
    //Description:
    //Once upon a time there was a rabbit who loved to steal carrots from the gardens of
    // the good software developers. Every time he leaped in a garden, he wanted to collect all
    // the carrots. Can you help the rabbit find how many times he has to jump to eat all the carrots?
    // The gardens are always square, he always enters from the top left corner and he has to jump once
    // for one group of carrots that have no space between each other vertically or horizontally


    //this class is not working properly, this is the base variant of the solution,
    //my idea was to implement graph, for depth first search principle I used
    //template which found in internet, something like a pseudo code of the
    //implementation.


    public int checkArray(int[][] garden) {
        int n = garden.length;
        int m = garden[0].length;
        boolean[][] visited = new boolean[n][m];
        int jumps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (garden[i][j] == 1 && !visited[i][j]) {
                    jumps++;
                    dfs(garden, visited, i, j);
                }
            }
        }

        return jumps;
    }
    private void dfs(int[][] garden, boolean[][] visited, int curRow, int curCol) {
        int row = garden.length;
        int col = garden[0].length;

        if (curRow < 0 || curRow >= row
                || curCol < 0 || curCol >= col
                || garden[curRow][curCol] == 0
                || visited[curRow][curCol]) {
            return;
        }

        visited[curRow][curCol] = true;
        dfs(garden, visited, curRow+1, curCol);
        dfs(garden, visited, curRow-1, curCol);
        dfs(garden, visited, curRow, curCol+1);
        dfs(garden, visited, curRow, curCol-1);
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