import java.util.Scanner;
public class bai5 {
     public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen x: ");
        int x = scanner.nextInt();
        int dem = 0;
        for(int i = 1; i<=x; i++)
        {
            if(x % i == 0)
                dem++;
        }
        if(dem == 2)
            System.out.println(x + " la so nguyen to");
        else
            System.out.println(x + " khong phai la so nguyen to");
    }
}