import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а;");
        double a = scanner.nextDouble();
        System.out.println("Введите число b;");
        double b = scanner.nextDouble();
        System.out.println("Введите число c;");
        double c = scanner.nextDouble();
        System.out.println(a + "x*x +" + b + "x+" + c + "= 0");
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Корней уравнения бесчисленное множество;");
                } else {
                    System.out.println("Корней уравнения нет");
                }
            } else {
                System.out.println("Если а = 0, то у вас получается линейное уравнение " + b + "*x + " + c + " = 0;");
                double x = -c / b;
                System.out.println("Решение линеного уравнения:\nх = " + x);
            }
        } else {
            double D = b * b - 4 * a * c;
            System.out.println("D = " + D);
            if (D > 0) {
                System.out.println("Так как дискриминант больше нуля то, квадратное уравнение имеет два действительных корня;");
                double m = Math.sqrt(D);
                double x1 = (-b + m) / 2 * a;
                double x2 = (-b - m) / 2 * a;
                System.out.println("x1 = " + x1 + "\nx2 = " + x2);
            } else if (D == 0) {
                System.out.println("Так как дискриминант равен нулю то, квадратное уравнение имеет один действительный корень;");
                double x = -b / (2 * a);
                System.out.println("x1 = x2 = " + x);
            } else {
                System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений;");
            }
        }
    }
}

