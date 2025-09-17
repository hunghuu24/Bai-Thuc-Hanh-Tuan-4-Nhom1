import java.util.Scanner;
public class vinhquangbai7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int mang[] = new int [n];
        int tong=0;
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("mang[" + (i+1) + "] = ");
            mang[i] = sc.nextInt();
            tong += mang[i];
        }
        System.out.println("Tong cac phan tu trong mang la: "+ tong);
        sc.close();
    }
}