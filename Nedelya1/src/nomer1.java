public class nomer1 {

    public static void main(String[] args) {

        int[][] matrix = {
                {5, 8},
                {1, 4},
                {3, 14},
                {6, 2},
        };

        for (int x = 0; x < matrix[0].length; x++) {

            int highestOnTheRow = -1;
            int indexOfHighest = -1;

            for (int y = 0; y < matrix.length; y++) {
                if (matrix[y][x] > highestOnTheRow) {
                    highestOnTheRow = matrix[y][x];
                    indexOfHighest = y;
                }
            }

            boolean highest = true;

            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[indexOfHighest][i] > highestOnTheRow) {
                    highest = false;
                }
            }
            if (highest) {
                System.out.println("Если форумла верна, то это седловая точка: " + highestOnTheRow);
            }
        }
    }

    public void nomer1() {
    }
}