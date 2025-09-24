import java.util.ArrayList;
import java.util.Scanner;

public class Bai_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhap so phan tu ban dau: ");
        int n, i, vt, x, vt2, y;
        n = sc.nextInt();
        for (i = 0; i < n; i++) 
        {
            System.out.printf("Nhap phan tu thu %d: ", i);
            ds.add(sc.nextInt());
        }
        System.out.println("Danh sach ban dau: " + ds);
        System.out.print("Nhap vi tri muon chen: ");
        vt = sc.nextInt();
        System.out.print("Nhap gia tri muon chen: ");
        x = sc.nextInt();
        if (vt >= 0 && vt <= ds.size()) 
        {
            ds.add(vt, x);
            System.out.println("Danh sach sau khi chen: " + ds);
        } 
        else 
        {
            System.out.println("Vi tri chen khong hop le!");
        }
        System.out.print("Nhap vi tri muon xoa: ");
        vt2 = sc.nextInt();

        if (vt2 >= 0 && vt2 < ds.size()) 
        {
            ds.remove(vt2);
            System.out.println("Danh sach sau khi xoa: " + ds);
        } 
        else 
        {
            System.out.println("Vi tri xoa khong hop le!");
        }
        sc.close();
    }
}
