import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        String[] nazv = {"Крыса", "Бык", "Тигр", "Кролик",
                "Дракон", "Змея", "Лошадь", "Коза",
                "Обезьяна", "Петух", "Собака", "Свинья"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, месяц, год (например: 5 12 1974)");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        String zodiacGod = nazv[(year - 4) % 12];

        String zodiacSing = "";
        switch (month) {
            case 1:
                if (day < 20) {
                    zodiacSing = "Козерог";
                } else {
                    zodiacSing = "Водолей";
                }
                break;
            case 2:
                if (day < 19) {
                    zodiacSing = "Водолей";
                }else {zodiacSing="Рыбы";

                }break;
            case 3:
                if (day<21) {
                    zodiacSing = "Рыбы";
                }else {
                    zodiacSing = "Овен";
                }
                break;
            case 4:
                if (day<20) {
                    zodiacSing="Овен";}
                else {zodiacSing="Телец";}
                break;
            case 5:
                if (day<21) {
                    zodiacSing = "Телец";
                }else {zodiacSing="Близнецы";}
                break;
            case 6:
                if (day<22) {
                zodiacSing = "Близнецы";
            }else {zodiacSing="Рак";}
                break;
            case 7:
                if (day<23) {
                    zodiacSing = "Рак";
                }else {zodiacSing="Лев";}
                break;
            case 8:
                if (day<23){
                    zodiacSing="Лев";}
                else {zodiacSing="Дева";}
                break;
            case 9:
                if (day<23) {
                    zodiacSing="Дева";}
                else {zodiacSing="Весы";}
                break;
            case 10:
                if (day<23) {
                    zodiacSing="Весы";}
                else {zodiacSing="Скорпион";}
                break;
            case 11:
                if (day<23){
                    zodiacSing="Скорпион";}
                else {zodiacSing="Стрелец";}
                break;
            case 12:
                if(day<22){
                    zodiacSing="Стрелец";}
                else {zodiacSing="Козерог";}
                break;

        }
        System.out.println("Знак: " +zodiacSing);
        System.out.println("Год: " +zodiacGod);
    }
}
