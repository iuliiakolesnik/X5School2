import java.util.*;

public class Task7 {

    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        int code = reader.nextInt();

        switch (code) {
            case 905:
                System.out.println("Москва. Стоимость разговора: " + 10 * 4.15);
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: " + 10 * 1.98);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + 10 * 2.69);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + 10 * 5.00);
                break;
            default:
                System.out.println("Неправильно введен код города");
                break;
        }
    }
}
