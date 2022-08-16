package HomeWork15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        int a = scanner.nextInt();
        circle.setArea(a);
        System.out.println(circle.getArea());

        circle.setCircumference(a);
        System.out.println(circle.getCircumference());
    }
}
