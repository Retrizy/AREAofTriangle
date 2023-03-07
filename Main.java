import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double c,a,b,cevre,Alan,u;
        System.out.println("Dik  kenarlarin uzunluğunu giriniz.");

        a = input.nextDouble();
        System.out.print("a = ");
        System.out.println(a);

        b = input.nextDouble();
        System.out.print("b = ");
        System.out.println(b);

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs = " + c);

        cevre = a+b+c;
        u = cevre / 2;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan = " + Alan);


    }
}