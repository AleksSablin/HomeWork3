import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int number = sc.nextInt();
        var podezd = (number + 35)/ 36;
        number -= (podezd -1) * 36;
        var etag = (number + 3)/ 4;
        System.out.println("Подъезд" + podezd);
        System.out.println("Этаж" + etag);

    }
}
