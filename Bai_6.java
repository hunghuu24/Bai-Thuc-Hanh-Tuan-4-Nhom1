import java.util.Scanner;

public class Bai_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao hai so nguyen: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int x = a, y = b;
        while(b != 0)
        {
            int tg = b;
            b = a % b;
            a = tg;
        }
        int UCLN = a;
        int BCNN = (x * y) / UCLN;
        System.out.println("UCLN = " + UCLN);
        System.out.println("BCNN = " + BCNN);
        sc.close();
    }
}
