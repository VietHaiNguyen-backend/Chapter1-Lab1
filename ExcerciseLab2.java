package Excercise1;

import java.util.Scanner;

public class ExcerciseLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chieu rong cua hinh chu nhat: ");
        int chieuRong = scanner.nextInt();

        System.out.print("Nhap vao chieu dai cua hinh chu nhat: ");
        int chieuDai = scanner.nextInt();

        int chuVi = (chieuRong + chieuDai) * 2;
        int dienTich = chieuRong * chieuDai;
        int canhMin = Math.min(chieuRong, chieuDai);

        System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich cua hinh chu nhat la: " + dienTich);
        System.out.println("Canh nho nhat la: " + canhMin);

        scanner.close();
    }
}