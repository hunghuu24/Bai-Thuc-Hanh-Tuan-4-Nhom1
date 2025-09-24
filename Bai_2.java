import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");    
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");    
        int b = scanner.nextInt();
        System.out.println("Nhap so c: ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("So lon nhat la: " + max);
        scanner.close();
    }
}

