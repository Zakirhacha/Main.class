
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        if (userNumber < 0) {
            userNumber *= -1;
        }

        for(; userNumber != 0; userNumber /= 10) {
            int temp = userNumber % 10;
            if (temp > maxNumber) {
                maxNumber = temp;
            }
        }
        System.out.print("\nМаксимальная цифра " + maxNumber);
    }

}