import java.util.Scanner;

public class TaskThirtyNine {
    public static void main(String[] args){
        System.out.println(changeNumber());
    }

    private String userPutNumber(){
        System.out.println("¬ведите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static String changeNumber(){
        String number = new TaskThirtyNine().userPutNumber();
        String result = "";
        int j = number.length() - 2;
        for (int i = number.length() - 1; i >= 0; --i){
            if (j >= 0 && number.charAt(i) > number.charAt(j)){
                result = number.charAt(j) + result;
                result = number.charAt(i) + result;
                --i;
            } else result = number.charAt(j) + result;
            --j;
        }
        if (result.equals(number)) return "-1";
        else return result;
    }
}