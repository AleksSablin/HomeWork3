import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner sc=new Scanner(System.in);
        System.out.println("Выберите животное");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Утка");
        System.out.println("4. Свинья");
        System.out.println("5. Лягушка");
        System.out.println("6. Корова");
        System.out.println("7. Попугай");
        System.out.println("8. Коза");
        System.out.println("9. Лошадь");
        System.out.println("10. Мышь");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Гав-гав");
                break;
            case 2:
                System.out.println("Мяу-мяу");
                break;
            case 3:
                System.out.println("Кря-кря");
                break;
            case 4:
                System.out.println("Хрю-хрю");
                break;
            case 5:
                System.out.println("Ква-ква");
                break;
            case 6:
                System.out.println("Му-му");
                break;
            case 7:
                System.out.println("Чирик-чирик");
                break;
            case 8:
                System.out.println("Бее-бее");
                break;
            case 9:
                System.out.println("Иго-го");
                break;
            case 10:
                System.out.println("Пи-пи");
                break;
            default:
                System.out.println("Выберите животное из списка");
        }
    }
}
