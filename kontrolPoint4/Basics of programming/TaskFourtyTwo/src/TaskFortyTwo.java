import java.util.Arrays;
import java.util.Scanner;

public class TaskFortyTwo {
    public static void main (String[] args){
        System.out.println(result());
    }
    private int[][] putIntervals(){
        System.out.println("ввидите количество интервалов ");
        Scanner in = new Scanner(System.in);
        int[][] putIntervals = new int[in.nextInt()][2];
        System.out.println("ввидите количество интервалов ");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < putIntervals.length; ++i){
            for (int j = 0; j < putIntervals[i].length; ++j){
                putIntervals[i][j] = scn.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(putIntervals));
        return putIntervals;
    }
    private static int result(){
        int[][] putIntervals = new TaskFortyTwo().putIntervals();
        int result = 0, between = 0;
        for (int i = 0; i < putIntervals.length; ++i){
            for (int j = putIntervals[i].length - 1; j >= 0; --j){
                if (j < putIntervals[i].length - 1) between -= putIntervals[i][j];
                else between += putIntervals[i][j];
                //result += putIntervals[i][1] - putIntervals[i][0];
            }
            result += between;
            between = 0;
        }
        return result;
    }
}