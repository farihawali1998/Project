package Project;

public class Task4 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int [][] numbers= {{1,3,4,5,6,7},
                {4,9,8,2,1},
                {9,8,3,2}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j] + " ");
                }
            }
        }
    }
}
