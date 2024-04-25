import java.util.Scanner;

public class TaskFortyFive {
    public static void main(String[] args){
        System.out.println(result());
    }
    private int putUser(){
        System.out.println("Ввидите число от 1 до 10000");
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        if(inp > 1 && inp < 10000) return inp;
        else {
            System.out.println("Вы ввели неверное число");
            return 0;
        }
    }
    public static String result(){
        int input = new TaskFortyFive().putUser();
        String res = "";
        String[] RN_M = {"", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM"};
        String[] RN_C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] RN_X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] RN_I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        res += RN_M[input / 1000];
        res += RN_C[input % 1000 / 100];
        res += RN_X[input % 100 / 10];
        res += RN_I[input % 10];
        return res;
    }

    /*private String[] arrayRimNumbers(){
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);


        roman_numerals.put("IX", 9);
        roman_numerals.put("VIII", 8);
        roman_numerals.put("VII", 7);
        roman_numerals.put("VI", 6);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("III", 3);
        roman_numerals.put("II", 2);
        roman_numerals.put("I", 1);

        String[] rimNumbers = new String[] {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
                "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
                "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM", "MMMMMMMMMM"};
        return rimNumbers;
    }*/


}
