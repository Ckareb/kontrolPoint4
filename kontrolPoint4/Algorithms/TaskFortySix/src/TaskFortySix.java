import java.util.Scanner;

public class TaskFortySix {
    public static void main(String[] args){
        System.out.println(result());
    }
    private String putUser(){
        System.out.println("Ввидите число от I до MMMMMMMMM");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static String result(){
        StringBuffer input = new StringBuffer(new TaskFortySix().putUser());
        int res = 0, i = 0, count = input.length();

        String[] rome = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arab = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        while (count >= 0 ){
            if (i == rome.length) i = 0;
            if(rome[i].length() <= input.length()){
                if (rome[i].equals(input.substring(0, rome[i].length()))) {
                    res += arab[i];
                    input.delete(0, rome[i].length());
                    count -= rome[i].length();
                }
            }else {
                res += arab[rome.length - 1];
                break;
            }
            ++i;
        }
        return "Ответ " + res;
    }
}