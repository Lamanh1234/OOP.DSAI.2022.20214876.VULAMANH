import java.util.Scanner;

public class AddMatrix {
    public static void main(String args[]){
        // Take the input:
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int nRow = keyboard.nextInt();
        System.out.print("Enter the number of column: ");
        int nCol = keyboard.nextInt();

        // Enter the element:
        System.out.println("Enter the first Matrix:");
        int[][] arr1 = new int[nRow][nCol];
        for (int i = 0; i < nRow; i++){
            for (int j=0; j < nCol; j++){
                arr1[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter the second Matrix:");
        int[][] arr2 = new int[nRow][nCol];
        for (int i = 0; i < nRow; i++){
            for (int j=0; j < nCol; j++){
                arr2[i][j] = keyboard.nextInt();
            }
        }

        // Take the sum and print matrix
        System.out.println("The sum of 2 matricies:");
        int[][] arrSum = new int[nRow][nCol];
        for (int i = 0; i < nRow; i++){
            String line = "";
            for (int j = 0; j < nCol; j++){
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
                line += arrSum[i][j] + " ";
            }
            System.out.println(line);
        }

    }
}
