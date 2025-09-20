import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Cong\n2.Tru\n3.Nhan\n4.Chia\nChon phep tinh: ");
        int choice = scanner.nextInt();
        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Ket qua: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Ket qua: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Ket qua: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Ket qua: " + result);
                } else {
                    System.out.println("Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }
}