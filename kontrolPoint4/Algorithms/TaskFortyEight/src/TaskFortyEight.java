import java.util.Arrays;
import java.util.Scanner;

public class TaskFortyEight {
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(new String[]{Arrays.toString(result())}));
    }

    private int putUser(){
        System.out.println("¬видите x ");
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        return inp;
    }

    private int[] arrayX(){
        int x = new TaskFortyEight().putUser();
        int y = 1;
        int[] result = new int[15];
        for(int i = 0; i < result.length; ++i){
            result[i] = y;
            y = 2*x+1;
            ++x;
        } System.out.println(Arrays.toString(result));
        return result;
    }

    private int[] arrayZ(){
        int x = new TaskFortyEight().putUser();
        int z = 1;
        int[] result = new int[15];
        for(int i = 0; i < result.length; ++i){
            result[i] = z;
            z = 3*x+1;
            ++x;
        } System.out.println(Arrays.toString(result));
        return result;
    }

    private static int[] result(){
        int[] arrayY = new TaskFortyEight().arrayX();
        int[] arrayZ = new TaskFortyEight().arrayZ();
        int count = 0, j = 0, k = 0;

        int[] result = new int[arrayY.length];
        for(int i = 0; i < result.length; ++i){
            //if (arrayY[j] <= 13){
                if (arrayY[j] == arrayZ[k]) {
                    result[i] = arrayY[j];
                    //System.out.println(Arrays.toString(new int[]{arrayY[j]}));
                    ++j;++i;++k;
                    result[i] = arrayY[j];

                    //System.out.println(Arrays.toString(new int[]{arrayY[j]}));

                    //System.out.println(j);
                } else if (arrayY[j+1] > arrayZ[k]){
                    //System.out.println(Arrays.toString(new int[]{arrayZ[k]}));
                    ++j;
                    result[i] = arrayZ[k];
                    ++k;++j;
                    //System.out.println(k);
                }

            /*} else {
                    while (count != 1) {
                        j+=1; k+=1; count = 1;
                        System.out.println(k);
                    }


                if (arrayY[j] == arrayZ[k]) {
                    result[i] = arrayY[j];
                    ++i;
                    ++j;
                    result[i] = arrayY[j];
                    ++i;++k;
                    result[i] = arrayZ[k];
                }
            }*/
        } return result;
    }
}