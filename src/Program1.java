import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1, b=1, c=1, s=0;
		int n; //max total price;
		System.out.println("Program for all Combinations: Please fill the data ! ");
		System.out.println("Type n: ");
		n = in.nextInt();
		in.close();
		
		int m=n-2; //counting for three components
		int i=1; //counter
		
		for (a=1;a<=m;a++) {
			for (b=1;b<=m;b++) {
				for (c=1;c<=m;c++) {
					s=a+b+c;
					if (s==n) {
						System.out.println(i + ". " + "Rose = " + a + "; Romashka = " + b + "; Fialka = " + c + "; Total price = " + s + ";");
						i++;
					}
				}
				s=a+b+c;
				if (s==n) {
					System.out.println(i + ". " + "Rose = " + a + "; Romashka = " + b + "; Fialka = " + c + "; Total price = " + s + ";");
					i++;
				}
			}
			s=a+b+c;
			if (s==n) {
			  	System.out.println(i + ". " + "Rose = " + a + "; Romashka = " + b + "; Fialka = " + c + "; Total price = " + s + ";");
			  	i++;
			}
		}
	}
}