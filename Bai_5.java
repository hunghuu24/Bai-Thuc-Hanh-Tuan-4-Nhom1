import java.util.Scanner;

public class Bai5chinh 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int n,i;
        n = sc.nextInt();
        if(n > 1)
        {
            if(n==2)
            {
                System.out.println(n + " la so nguyen to");
            }
            else
            {
                for(i=2; i<=Math.sqrt(n); i++)
                {
                    if(n%i==0)
                    {
                        System.out.println(n + " khong phai la so nguyen to");
                        break;
                    }
                }
                if(i>Math.sqrt(n))
                {
                    System.out.println(n + " la so nguyen to");
                }
            }
        }
        sc.close();
    }
}