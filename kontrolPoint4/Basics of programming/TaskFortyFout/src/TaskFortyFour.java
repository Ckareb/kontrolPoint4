import java.util.Scanner;

public class TaskFortyFour {
    public static void main (String[] args){
        System.out.println(result());
    }

    private String putNumber( int n){
        System.out.println("ввидите число " + n);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    private static String result() {
        int n = 1 , result = 0;
        String numberOne = new TaskFortyFour().putNumber(n);
        ++n;
        String numberTwo = new TaskFortyFour().putNumber(n);
        return numberOne + "+" + numberTwo + "=" + (Integer.parseInt(numberOne) + Integer.parseInt(numberTwo));
    }
}