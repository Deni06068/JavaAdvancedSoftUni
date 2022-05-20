
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] matrix = new int[2][][];
        for (int i = 0; i < matrix.length; i++) {
            String[] dimensions = scanner.nextLine().split("\\s+");
            int row = Integer.parseInt(dimensions[0]);
            int col = Integer.parseInt(dimensions[1]);
            matrix[i] = new int[row][];
            for (int j = 0; j < row; j++) {
                int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                matrix[i][j] = arr;
            }
        }
        boolean isEqual = true;
        for (int i = 0; i < matrix[0].length; i++) {
            if (!Arrays.equals(matrix[0][i], matrix[1][i])){
                System.out.println("not equal");
                isEqual = false;
                break;
            }
        }
        if (isEqual){
            System.out.println("equal");
        }
    }
}
