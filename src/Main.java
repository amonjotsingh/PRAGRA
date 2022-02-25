public class Main {

    public static void printSumOfColumn(int arr[][]) {
        float sumCol1 = 0;
        float sumCol2 = 0;
        float sumCol3 = 0;
        for (int i = 0; i < 5; i++) {
                sumCol1 += arr[i][0];
                sumCol2 += arr[i][1];
                sumCol3 += arr[i][2];
        }
        System.out.println("Sum of column 1 is " + sumCol1/5);
        System.out.println("Sum of column 2 is " + sumCol2/5);
        System.out.println("Sum of column 3 is " + sumCol3/5);
    }


    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        printSumOfColumn(arr);
    }
}