import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x, u, s = 1, eps = 0.00001;
    System.out.println("Введіть значення x");
    x = scanner.nextDouble();
    u = x / 3;
    int n = 2;
    while (Math.abs(u) > eps) {
        s += u;
        u *= x * (3 * n - 4) / (3 * n);
        n++;
    }
    System.out.printf("Значення суми s = %.6f\n", s);
    System.out.printf("Значення функції: %.6f\n",
            Math.pow(1 + x, -1.0 / 3.0));
    System.out.println("Кількість доданків " + (n - 1));
    scanner.close();
    }
}