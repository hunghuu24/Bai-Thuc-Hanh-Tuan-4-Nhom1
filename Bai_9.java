import java.util.Scanner;
public class Bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong phan tu cua mang: ");
        n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("CCac phan tu trong mang la:");
        for (int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
    }
}