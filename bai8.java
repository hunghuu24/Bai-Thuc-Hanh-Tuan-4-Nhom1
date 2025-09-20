import java.util.Scanner;
public class bai8 {
    public static void timKiem(int a[], int n) {
    if (n == 0) {
        System.out.println("Mang rong");
        return;
    }
    
    int soLanXuatHienNhieuNhat = 0;
    int phanTuXuatHienNhieuNhat = a[0];
    
    for (int j = 0; j < n; j++) {
        boolean daDem = false;
        for (int k = 0; k < j; k++)
         {
            if (a[k] == a[j]) 
            {
                daDem = true;
                break;
            }
        }
        if (!daDem) 
        {
            int x = a[j];
            int dem = 1;
            for (int i = j + 1; i < n; i++) 
            {
                if (a[i] == x) 
                {
                    dem++;
                }
            }
            
            if (dem > soLanXuatHienNhieuNhat) 
            {
                soLanXuatHienNhieuNhat = dem;
                phanTuXuatHienNhieuNhat = x;
            }
        }
    }
    
    System.out.println("Phan tu xuat hien nhieu nhat: " + phanTuXuatHienNhieuNhat);
    System.out.println("So lan xuat hien: " + soLanXuatHienNhieuNhat);
}
   public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Mang la:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        timKiem(a, n);
        scanner.close();
    }
}