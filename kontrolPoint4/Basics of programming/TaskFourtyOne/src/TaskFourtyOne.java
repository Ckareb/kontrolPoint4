import java.util.Scanner;

public class TaskFourtyOne {
    public static void main(String[] args){
        System.out.println(result());
    }

    private int putSeconds(){
        System.out.println("ввидите количество секунд ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private int minutes(int seconds){
        float minutes = seconds / 60;
        if (minutes < 1) return 0;
        else return (int) minutes;
    }

    private int hours(int minutes){
        float hours = minutes/ 60;
        if (hours < 1)  return 0;
        else return (int) hours;
    }

    private int days(int hours){
        float days = hours/ 24;
        if (days < 1)  return 0;
        else return (int) days;
    }

    private int weeks(int days){
        float weeks = days/ 7;
        if (weeks < 1)  return 0;
        else return (int) weeks;
    }

    private int years(int weeks){
        float years = weeks/ 52;
        if (years < 1)  return 0;
        else return (int) years;
    }

    private static StringBuilder result(){
        int seconds = new TaskFourtyOne().putSeconds();
        int minutes = new TaskFourtyOne().minutes(seconds);
        int hours = new TaskFourtyOne().hours(minutes);
        int days = new TaskFourtyOne().days(hours);
        int weeks = new TaskFourtyOne().weeks(days);
        int years = new TaskFourtyOne().years(weeks);

        if (seconds <= 0) return new StringBuilder("Слишком мелнькое число");
        else {
            seconds = seconds - 60 * minutes;
            minutes = minutes - 60 * hours;
            hours = hours - 24 * days;
            days = days - 7 * weeks;
            weeks = weeks - 52 * years;

            StringBuilder result = new StringBuilder();
            int count = 0, max = 0;

            if (years != 0) {
                result.append(years).append(" лет, ");
                max = years + " лет, ".length();
                ++count;
            }

            if (weeks != 0) {
                result.append(weeks).append(" недель, ");
                max = weeks +" недель, ".length();
                ++count;
            }

            if (days != 0) {
                result.append(days).append(" дней, ");
                max = days + " дней, ".length();
                ++count;
            }
            if (hours != 0) {
                result.append(hours).append(" часов, ");
                max = hours + " часов, ".length();
                ++count;
            }

            if (minutes != 0) {
                result.append(minutes).append(" минут, ");
                max = minutes + " минут, ".length();
                ++count;
            }

            if (seconds != 0) {
                result.append(seconds).append(" секунд, ");
                max = seconds + " секунд, ".length();
                ++count;
            }

            if (count > 1) {
                result.insert(result.length() - max, " и");
            }

            result.deleteCharAt(result.length() - 2);
            int lean = result.indexOf(" и ");
            result.deleteCharAt(lean - 1);

            return result;
        }
    }
}