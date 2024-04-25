import java.util.Scanner;
import static java.lang.Math.abs;

public class TaskFourty {
    public static void main(String[] args){
        System.out.println(resultArray());
    }

    private int[] putArray(){
        System.out.println("ввидите длину массива ");
        Scanner in = new Scanner(System.in);
        int[] putArray = new int[in.nextInt()];
        System.out.println("¬видите массив ");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < putArray.length; ++i){
            putArray[i] = scn.nextInt();
        }
        return putArray;
    }

    private static  String resultArray() {
        int[] putArray = new TaskFourty().putArray();
        int j = 1, count = 0, a = 0;
        String result = "";
        for (int i = 0; i < putArray.length; ++i){
            if (putArray[i] >= 0){
                if (j < putArray.length && putArray[i] - putArray[j] != -1 || i == putArray.length - 1){
                    result += putArray[i] + ", ";
                    count = 0;
                    ++j;
                }else {
                    if (count == 0) result += putArray[i] + "-";
                    count = 1;
                    ++j;
                }
            } else {
                if (j < putArray.length && abs(putArray[i]) - abs(putArray[j]) != 1 || i == putArray.length - 1){
                    result += putArray[i] + ", ";
                    count = 0;
                    ++j;
                }else {
                    if (count == 0) result += putArray[i] + "-";
                    count = 1;
                    ++j;
                }
            }

        }
        return result;
    }
}