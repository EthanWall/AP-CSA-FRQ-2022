package q4;

public class Data {

    public static final int MAX = 1000;     // Arbitrarily high number
    private int[][] grid;

    public Data(int[][] gridData) {
        this.grid = gridData;
    }

    public void repopulate() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length;) {
                int rand = (int) (Math.random() * (MAX - 1)) + 1;

                if (rand % 10 != 0 || rand % 100 == 0)
                    continue;

                grid[row][col] = rand;
                col++;
            }
        }
    }

    public int countIncreasingCols() {
        int increasingCols = 0;

        for (int col = 0; col < grid[0].length; col++) {
            int row, highestValue;
            for (row = 0, highestValue = 0; row < grid.length;) {
                if (grid[row][col] < highestValue)
                    break;

                highestValue = grid[row][col];
                row++;
            }

            if (row == grid.length)
                increasingCols++;
        }

        return increasingCols;
    }

    public int[][] getGrid() { return grid.clone(); }

}
