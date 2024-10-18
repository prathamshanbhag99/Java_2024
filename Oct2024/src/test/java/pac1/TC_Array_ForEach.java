package pac1;

public class TC_Array_ForEach {

    public static void main(String[] args) {
        // 1D array
        int[] sqrs = {100, 200, 300, 400, 500};

        System.out.println("1D Array Elements:");
        for (int i : sqrs) {
            System.out.println(i);
        }

        // 2D array
        int[][] matrix =
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n2D Array Elements:");
        
        for (int[] row : matrix)
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
