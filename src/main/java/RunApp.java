import java.util.Scanner;

public class RunApp {


    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        Fibonacci.fibonacciGetNumber(scanner);

    }
}
