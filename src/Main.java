import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Triangle деген класс тузунуз.Класстын 3 полеси болсун a, b, c.Класстын "area" деген методу болсун.
        //"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
        //таянып консолго уч бурчтуктун аянтын чыгарсын.

        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Write a A:  ");
        triangle.a = scanner.nextInt();
        System.out.print("Write a B:  ");
        triangle.b = scanner.nextInt();
        System.out.print("Write a C:  ");
        triangle.c = scanner.nextInt();
        triangle.area();
        System.out.println("Program finished!");
    }
}