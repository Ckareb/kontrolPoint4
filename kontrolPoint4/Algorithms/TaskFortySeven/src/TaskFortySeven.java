import java.util.Arrays;
import java.util.Scanner;

public class TaskFortySeven {
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(result()));
    }

    private static int putRow(){
        System.out.println("¬видите количесво строк массива ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static int putColumn(){
        System.out.println("¬видите количесво столбцов массива ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private Begin putUser(){
        int row = putRow();
        int column = putColumn();
        int[] putArray = new int[row*column];
        for (int i = 0; i < putArray.length; ++i){
            putArray[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(putArray));
        return new Begin(row, column, putArray);
    }
    public static int[][] result(){
        Begin begin =  new TaskFortySeven().putUser();
        int[][] result = new int[begin.row][begin.column];
        int f = 0;
        for(int k = 0; k < begin.row*begin.column; k++) {
            int i = k / begin.column;
            int j = i % 2 == 0 ? k % begin.column : begin.column - 1 - k % begin.column;
            result[i][j] = begin.putArray[f];
            if (f < begin.putArray.length - 1) ++f;
        }
        return result;
    }
}