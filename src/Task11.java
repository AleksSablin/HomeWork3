import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание 11");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициент a: ");
        double a = sc.nextDouble();
        System.out.println("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.println("Введите коэффициент c: ");
        double c = sc.nextDouble();

        double discr = b * b -4 * a * c;
        if (discr >0){
            double x1= (-b + Math.sqrt(discr)) / (2*a);
            double x2= (-b - Math.sqrt(discr)) / (2*a);
            System.out.println("Корни квадратного уравнения: x1 = " + x1 + " x2 = " + x2);
        } else if (discr == 0) {
            double x = -b/(2*a);
            System.out.println("Корень равен x = " + x);
        }else {
            System.out.println("Квадратное уравнение не имеет действительных корней.");}

    }
}
