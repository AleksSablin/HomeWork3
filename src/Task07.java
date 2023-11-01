import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String simvol = sc.nextLine();
        Pattern patLatLetter = Pattern.compile("[a-zA-Z]");// Паттерны
        Matcher matLetLetter = patLatLetter.matcher(simvol);

        Pattern patKirLetter = Pattern.compile("[а-яА-Я]");// Паттерны
        Matcher matKirLetter = patKirLetter.matcher(simvol);

        Pattern patNumber = Pattern.compile("[0-9]");
        Matcher matNumber = patNumber.matcher(simvol);

        if (matLetLetter.matches()){
            System.out.println("Латиница");}
        else if (matKirLetter.matches()){
            System.out.println("Кириллица");}
        else if (matNumber.matches()) {
            System.out.println("Цифра");
        }else {
            System.out.println("Невозможно определить.");}
        System.out.println();
    }
}
