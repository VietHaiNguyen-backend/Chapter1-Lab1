package Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array ban dau: " + Arrays.toString(a));
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        scanner.close();
    }
}
