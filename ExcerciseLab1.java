package Excercise1;

import java.util.Scanner;

public class ExcerciseLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap diem sinh vien: ");
        int score = scanner.nextInt();

        System.out.print(name + " co diem = " + score);

        scanner.close();
    }
}
