import java.util.Scanner;

public class FourCalculation_PercentCal_10430 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a+b)%c + "\n" + (a%c+b%c)%c + "\n" + (a*b)%c + "\n" + (a%c*b%c)%c);
	}
}