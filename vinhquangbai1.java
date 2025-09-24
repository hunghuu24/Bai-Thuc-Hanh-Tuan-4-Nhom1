import java.util.Scanner;
public class vinhquangbai1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so: ");
        double so = sc.nextDouble();
        if(so>0)
            System.out.println(so + " la so duong ");
        else
            if(so<0)
                System.out.println(so + " la so am " );
            else
                System.out.println("So bang 0");
        sc.close();
    }
}