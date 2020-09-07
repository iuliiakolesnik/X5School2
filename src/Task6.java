import java.util.*;

public class Task6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = reader.nextInt();

        if (number == 0) {
            System.out.println("Нулевое число");
        } else {
            if (number % 2 == 0) {
                if (number > 0) {
                    System.out.println("Положительное четное число");
                } else {
                    System.out.println("Отрицательное четное число");
                }
            } else {
                if (number > 0) {
                    System.out.println("Положительное нечетное число");
                } else {
                    System.out.println("Отрицательное нечетное число");
                }
            }
        }
    }
}
