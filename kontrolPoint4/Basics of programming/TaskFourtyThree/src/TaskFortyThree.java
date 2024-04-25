import java.util.Arrays;
import java.util.Scanner;

public class TaskFortyThree {
    public static void main(String[] args){
        System.out.println(result());
    }
    private int[][] getArray(){
        System.out.println("ввидите размер строк и столбцов массива ");
        Scanner in = new Scanner(System.in);
        int[][] pyramid = new int[in.nextInt()][in.nextInt()];
        for (int i = 0; i < pyramid.length; i ++) {
            for (int j = 0; j < pyramid[i].length ; j ++) {
                if (j < pyramid[i].length-(1+i)){
                    pyramid[i][j] = 0;

                } else pyramid[i][j] = (int)(Math.random() * 10) + 1;;
            }System.out.println(Arrays.toString(pyramid[i]));
        }
        return pyramid;
    }
    private static int result(){
        int[][] pyramid = new TaskFortyThree().getArray();
        int sum = 0, max = 1, k = 0;
        for (int i = 0; i < pyramid.length; i ++) {
            for (int j = 0; j < pyramid[i].length ; j ++) {
                if (pyramid[i][j] != 0 &&  j >= k - 1 && k + 1 >= j && pyramid[i][j] > max || i == 0){
                    max = pyramid[i][j];
                    k = j;
                }
            }
            sum += max;
            max = 0;
        }
        return sum;
    }
}